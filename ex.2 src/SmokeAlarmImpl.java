import java.util.List;

public class SmokeAlarmImpl implements Subject, SmokeAlarm {
    private List<Observer> observers;
    private SmokeAlarmState state;
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
       // observers.forEach(observer -> observer.update());
    }
}
