import java.util.List;

public class SmokeAlarmImpl implements Subject, SmokeAlarm {
    private List<Observer> observers;
    private SmokeAlarmState state;
    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    public void onSmokeIsPresent() {
        this.state.onSmokeIsPresent();
    }
    public void onStopAlarmButtonIsPressed() {
        this.state.onStopAlarmButtonIsPressed();
    }

    public void startAlarm() {
        observers.forEach(observer -> observer.update());
    }
}
