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

    public void update(FraudAlert updatedAlert){
        alerts.set(updatedAlert) // teria que ter o id aqui também?
    }

    public void delete(FraudAlert alert){
        alerts.remove(alert);
    }

    public void deleteById(int id){
        for(FraudAlert alert : alerts){
            if(alert.getId() == id){
                alerts.remove(alert);
            }
        }
    }
}
