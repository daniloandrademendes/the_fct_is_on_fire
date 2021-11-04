package Lab4;

public class SmokeAlarmClass implements SmokeAlarm {
    private int smokeIntensity;
    private float temperature;
    private final SmokeAlarmSubject subject;

    public SmokeAlarmClass(SmokeAlarmSubject subject) {
        this.subject = subject;
    }


    @Override
    public void setChanges(int smokeIntesity, float temperature) {
        this.smokeIntensity = smokeIntesity;
        this.temperature = temperature;
        this.subject.notifyObservers(smokeIntensity, temperature);
    }
}
