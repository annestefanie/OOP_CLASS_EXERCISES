package src.model;

import java.math.BigDecimal;

public class Account {
    private String accountNumber;
    private String accountHolder;
    private BigDecimal balance;
    private BigDecimal zero;


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
        int returnCompare = amount.compareTo(zero);
        
        if (returnCompare == 1 && amount != null){
            balance = balance.add(amount);
            System.out.printf("\n\nSUCCESS. Your deposit has been processed.\n");
        }
        else {
            System.out.printf("\n\nERROR. The amount must be bigger than 0 and not null.\n");
        }
    }
    
    public void withdraw(BigDecimal amount){
        int returnCompare = amount.compareTo(zero);
        
        if (returnCompare == 1 && amount != null){
            balance = balance.subtract(amount);
            System.out.printf("\n\nSUCCESS. Your withdrawal has been processed.\n");
        }
        else {
            System.out.printf("\n\nERROR. The amount must be bigger than 0 and not null.\n");
        }
    }
}
