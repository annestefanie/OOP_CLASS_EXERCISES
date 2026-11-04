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
    
}
