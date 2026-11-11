package src.repository;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

import src.model.Transaction;
import src.model.TransactionType;

public class TransactionRepository {
    private List<Transaction> transactions = new ArrayList<>();

    // == METHODS == 

    public void save(Transaction newTransaction){ 
        
        if (newTransaction != null) { 
            transactions.add(newTransaction); 
        }
        else {
            throw new IllegalArgumentException("Transaction must be not null.");
        }
    }

    public List<Transaction> findAll(){ 
        return new ArrayList<>(transactions); 
    }

    public Optional<Transaction> findById(int id){

        for(Transaction transaction : transactions){
            if (transaction.getId() == id){
                return Optional.of(transaction);
            }

        }

        return Optional.empty();
    }

    public void update(Transaction updatedTransaction) {

        if (updatedTransaction == null) {
            throw new IllegalArgumentException("Transaction cannot be null.");
        }
    
        for (int i = 0; i < transactions.size(); i++) {
            if (updatedTransaction.getId() == transactions.get(i).getId()) {
                transactions.set(i, updatedTransaction);
                return;
            }
        }
    
        throw new IllegalArgumentException("Transaction not found.");
    }
   
    public void deleteById(int id){

        for(int i = 0; i < transactions.size(); i++){
            if(transactions.get(i).getId() == id){
                transactions.remove(i);
                return;
            }
        }
        throw new IllegalArgumentException("Id not found.");

    }

    public List<Transaction> findByAccountNumber(String accountNumber){
        
        if (accountNumber == null){
            throw new IllegalArgumentException("Account cannot be null.");
        }

        List<Transaction> result = new ArrayList<>();
        
        for(int i = 0; i < transactions.size(); i++){
            String acc = transactions.get(i).getAccount().getAccountNumber();
                
            if(accountNumber.equals(acc)){
                result.add(transactions.get(i));   
            }     
        }
        return result;
    }

    public List<Transaction> findByType(TransactionType type){

        if (type == null){
            throw new IllegalArgumentException("Type cannot be null.");
        }
        
        List<Transaction> result = new ArrayList<>();

        for(int i = 0; i < transactions.size(); i++){
            if(type.equals(transactions.get(i).getTransactionType())){
                result.add(transactions.get(i));
            }
        }

        return result;
    }
}
