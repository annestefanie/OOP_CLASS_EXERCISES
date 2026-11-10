package src.model;

import java.math.BigDecimal;

public class Account {
    private String accountNumber;
    private String accountHolder;
    private BigDecimal balance;

    public Account (String accountNumber, String accountHolder, BigDecimal balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // == GETTERS == 

    public String getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public BigDecimal getBalance(){
        return balance;
    }
    
    // == METHODS ==
    
    public void deposit(BigDecimal amount){
        
        if (amount != null || amount.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }

            balance = balance.add(amount);
    }
    
    public void withdraw(BigDecimal amount) {

        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }

        if (amount.compareTo(balance) > 0) {
            throw new IllegalStateException("Insufficient balance.");
        }

        balance = balance.subtract(amount);
    }
}
