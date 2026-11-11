package src.rules;

import java.util.List;
import src.model.Transaction;

public class DuplicateTransactionRule {

    public boolean isTransactionDuplicated(Transaction transaction, List<Transaction> transactions){
        for(int i = 0; i < transactions.size(); i++){

            Transaction current = transactions.get(i);

            if(
                current.getValue().compareTo(transaction.getValue()) == 0 &&
                current.getTransactionType().equals(transaction.getTransactionType()) &&
                current.getDateTime().equals(transaction.getDateTime())
                  
            ){
                return true;
            }   
        }

        return false;
    }
}
