package src.rules;

import java.math.BigDecimal;
import src.model.Transaction;


public class HighValueRule {
    private BigDecimal valueLimit;

    public HighValueRule(BigDecimal valueLimit){
        this.valueLimit = valueLimit;
    }

    // == GETTERS ==

    public BigDecimal getValueLimit(){
        return valueLimit;
    }

    // == SETTERS == 

    public void setValueLimit(BigDecimal newLimit){
        if(newLimit != null && newLimit.compareTo(BigDecimal.ZERO) > 0){
            valueLimit = newLimit;
        }
        else {
            throw new IllegalArgumentException("Limit must be greater than zero.");
        }
    }

    // == METHODS == 
    public boolean isTransactionValueHigh(Transaction transaction){
        if(transaction.getValue().compareTo(valueLimit) >= 0){
            return true;
        }
        else {
            return false;
        }
    }
    
}
