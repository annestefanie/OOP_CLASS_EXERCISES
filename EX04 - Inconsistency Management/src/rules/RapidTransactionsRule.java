package src.rules;

import java.util.List;

import java.time.LocalDateTime;

import src.model.Transaction;

public class RapidTransactionsRule {

     public boolean hasRapidTransactions(Transaction transaction, List<Transaction> transactions){
        int transactionsFound = 0;

        for(int i = 0; i < transactions.size(); i++){

            Transaction current = transactions.get(i);
            LocalDateTime startTime = transaction.getDateTime().minusMinutes(5);
            LocalDateTime endTime = transaction.getDateTime();
            
            if((current.getAccount().getAccountNumber()).equals(transaction.getAccount().getAccountNumber())){
            
                LocalDateTime currentDate = current.getDateTime();

                if (!currentDate.isBefore(startTime) && !currentDate.isAfter(endTime)) {
                    transactionsFound++;
                }
            }
        }
        return transactionsFound >= 4;
     }
}
