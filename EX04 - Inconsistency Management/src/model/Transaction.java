package src.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private Account account;
    private BigDecimal value;
    private LocalDateTime dateTime;
    private TransactionType type;
    private TransactionStatus status;

    public Transaction(Account account, BigDecimal value, LocalDateTime dateTime, TransactionType type, TransactionStatus status){
        this.account = account;
        this.value = value;
        this.dateTime = dateTime;
        this.type = type;
        this.status = status;
    }

    // == GETTERS ==

    public Account getAccount() {
        return account;
    }

    public BigDecimal getValue(){
        return value;
    }

    public LocalDateTime getDateTime(){
        return dateTime;
    }

    public TransactionType getTransactionType(){
        return type;
    }

    public TransactionStatus getTransactionStatus(){
        return status;
    }
}
