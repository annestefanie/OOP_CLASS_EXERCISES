
package src.service;

import java.util.List;

import src.model.Transaction;
import src.model.FraudAlert;
import src.repository.TransactionRepository;
import src.repository.AlertRepository;
import src.rules.FraudRule;

public class FraudDetector {

    private TransactionRepository transactionRepository;
    private AlertRepository alertRepository;
    private FraudRule fraudRule;

    public FraudDetector(
        TransactionRepository transactionRepository,
        AlertRepository alertRepository,
        FraudRule fraudRule
    ) {
        this.transactionRepository = transactionRepository;
        this.alertRepository = alertRepository;
        this.fraudRule = fraudRule;
    }

    public void detectFrauds() {

        List<Transaction> transactions =
            transactionRepository.findAll();

        for (Transaction transaction : transactions) {

            FraudAlert alert =
                fraudRule.hasFraud(transaction, transactions);

            if (alert != null) {
                alertRepository.save(alert);
            }
        }
    }
}
