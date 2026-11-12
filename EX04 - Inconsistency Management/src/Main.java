
package src;

import src.repository.TransactionRepository;
import src.repository.AlertRepository;
import src.rules.*;
import src.service.FraudDetector;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        TransactionRepository transactionRepository =
            new TransactionRepository();

        AlertRepository alertRepository =
            new AlertRepository();

        DuplicateTransactionRule duplicatedRule =
            new DuplicateTransactionRule();

        HighValueRule highValueRule =
            new HighValueRule(new BigDecimal("5000.00"));

        RapidTransactionsRule rapidRule =
            new RapidTransactionsRule();

        FraudRule fraudRule = new FraudRule(
            duplicatedRule,
            highValueRule,
            rapidRule
        );

        FraudDetector fraudDetector = new FraudDetector(
            transactionRepository,
            alertRepository,
            fraudRule
        );

        fraudDetector.detectFrauds();
    }
}
