package Lab4;

public interface SmokeAlarmSubject {
    void registerObserver(Observer o);
    void unregisterObserver(Observer o);
    void notifyObservers(int smokeIntensity, float temperature);
}
