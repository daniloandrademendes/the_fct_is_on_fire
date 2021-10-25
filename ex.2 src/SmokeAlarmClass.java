import java.util.ArrayList;
import java.util.List;

public class SmokeAlarmClass implements Subject, SmokeAlarm {
    private List<Observer> observers;
    private boolean alarmOn;
    private int smokeIntesity;
    private float temperature;





    public SmokeAlarmClass(){
        observers= new ArrayList<Observer>();
        alarmOn=false;
    }
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    public void unregisterObserver(Observer o) {
        observers.remove(o);
    }



    public  void changesMade(){
        notifyObservers();
    }
@Override
    public void setChanges(int smokeIntesity, float temperature) {
        this.smokeIntesity=smokeIntesity;
        this.temperature=temperature;
        changesMade();



    }
    public void notifyObservers() {
       for(Observer o: observers){
           o.update(smokeIntesity,temperature);
       }
    }
}
