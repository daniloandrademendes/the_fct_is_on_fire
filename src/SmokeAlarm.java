public interface SmokeAlarm extends Subject {
    void onSmokeIsPresent();
    void onStopAlarmButtonIsPressed();
}
