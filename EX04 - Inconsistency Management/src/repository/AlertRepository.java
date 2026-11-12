package src.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import src.model.FraudAlert;

public class AlertRepository {
    private List<FraudAlert> alerts = new ArrayList<>();

    // == METHODS == 

    public void save(FraudAlert newAlert){ 
        
        if (newAlert != null) { 
            alerts.add(newAlert); 
        }
        else {
            throw new IllegalArgumentException("Alert must be not null.");
        }
    }

    public List<FraudAlert> findAll(){ 
        return new ArrayList<>(alerts); 
    }

    public Optional<FraudAlert> findById(int id){

        for(FraudAlert alert : alerts){ 
            if (alert.getId() == id){
                return Optional.of(alert);
            }

        }

        return Optional.empty();
    }

    public void update(FraudAlert updatedAlert) {
        if (updatedAlert == null) {
            throw new IllegalArgumentException("Alert cannot be null.");
        }
    
        for (int i = 0; i < alerts.size(); i++) {
            if (updatedAlert.getId() == alerts.get(i).getId()) {
                alerts.set(i, updatedAlert);
                return;
            }
        }
    
        throw new IllegalArgumentException("Alert not found.");
    }
   
    public void deleteById(int id){
        for(FraudAlert alert : alerts){
            if(alert.getId() == id){
                alerts.remove(alert);
            }
        }
    }
}
