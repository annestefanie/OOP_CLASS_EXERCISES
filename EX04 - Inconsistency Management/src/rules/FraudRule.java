package src.rules;

import java.util.List;

import src.model.AlertStatus;
import src.model.FraudAlert;
import src.model.RiskLevel;
import src.model.Transaction;

public class FraudRule {
    private DuplicateTransactionRule duplicatedRule;
    private HighValueRule highValueRule;
    private RapidTransactionsRule rapidRule;

    public FraudRule(
        DuplicateTransactionRule duplicatedRule,
        HighValueRule highValueRule,
        RapidTransactionsRule rapidRule
    ){
        this.duplicatedRule = duplicatedRule;
        this.highValueRule = highValueRule;
        this.rapidRule = rapidRule;
    }

    public FraudAlert hasFraud(Transaction transaction, List<Transaction> transactions){

        boolean duplicated = duplicatedRule.isTransactionDuplicated(transaction, transactions);
        boolean highValue = highValueRule.isTransactionValueHigh(transaction);
        boolean rapid = rapidRule.hasRapidTransactions(transaction, transactions);

        int rulesTriggered = 0;
        
        if(duplicated) rulesTriggered++; 
        if(highValue) rulesTriggered++;
        if(rapid) rulesTriggered++;
        if (rulesTriggered == 0)  return null; 

        FraudAlert alert = new FraudAlert(transaction, AlertStatus.NEW, null);

        if(rulesTriggered == 1){
                alert.setRiskLevel(RiskLevel.LOW);
        }
        else if (rulesTriggered == 2){
                alert.setRiskLevel(RiskLevel.MEDIUM);
        }
        else {
                alert.setRiskLevel(RiskLevel.HIGH);
        }
        return alert; 

    }

}
