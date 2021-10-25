public class Main {
    public static void main(String[] args) {
        SmokeAlarm smokeAlarm = new SmokeAlarmClass();
        Display temperatureDisplay = new DisplayClass(smokeAlarm);
        WaterDispenserClass wd= new WaterDispenserClass(smokeAlarm);

        smokeAlarm.setChanges(7,50);

    }
}
