package src.model;

public class FraudAlert {
    private int id;
    private Transaction transaction;
    private AlertStatus alertStatus;
    private RiskLevel riskLevel;

    public FraudAlert (Transaction transaction, AlertStatus alertStatus, RiskLevel riskLevel){
        this.transaction = transaction;
        this.alertStatus = alertStatus;
        this.riskLevel = riskLevel;
    }

    // == GETTERS ==

    public Transaction getTransaction(){
        return transaction;
    }

    public AlertStatus getAlertStatus(){
        return alertStatus;
    }

    public RiskLevel getRiskLevel(){
        return riskLevel;
    }

    public int getId(){
        return id;
    }

    // == SETTERS == 

    public void setRiskLevel(RiskLevel riskLevel) {
        this.riskLevel = riskLevel;
    }

}
