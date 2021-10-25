public class Main {
    public static void main(String[] args) {
        SmokeAlarm smokeAlarm = new SmokeAlarmImpl();
        EmailNotifier emailNotifier = new EmailNotifier();
        smokeAlarm.subscribe(new EmailNotifier());
    }
}
