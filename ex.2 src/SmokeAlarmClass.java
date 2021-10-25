import java.util.ArrayList;
import java.util.List;

public class SmokeAlarmClass implements Subject, SmokeAlarm {
    private List<Observer> observers;
    private SmokeAlarmState state;

    public SmokeAlarmClass(){
        observers= new ArrayList<Observer>();
    }
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    public void unregisterObserver(Observer o) {
        observers.remove(o);
    }

    public void onSmokeIsPresent() {
        this.state.onSmokeIsPresent();
    }
    public void onStopAlarmButtonIsPressed() {
        this.state.onStopAlarmButtonIsPressed();
    }

    public void notifyObservers() {
       for(Observer o: observers){
           o.update();
       }
    }
}
