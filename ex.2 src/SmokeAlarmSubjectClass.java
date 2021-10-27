import java.util.ArrayList;
import java.util.List;

public class SmokeAlarmSubjectClass implements SmokeAlarmSubject {
    private final List<Observer> observers;

    public SmokeAlarmSubjectClass(){
        observers = new ArrayList<Observer>();
    }
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    public void unregisterObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(int smokeIntensity, float temperature) {
       for(Observer o: observers){
           o.update(smokeIntensity, temperature);
       }
    }
}
