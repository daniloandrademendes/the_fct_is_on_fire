public class Main {
    public static void main(String[] args) {
        SmokeAlarm smokeAlarm = new SmokeAlarmClass();
        WaterDispenser wd= new WaterDispenserStop(smokeAlarm);
        Display temperatureDisplay = new DisplayClass(smokeAlarm);

        System.out.println("** Water Dispenser State **");
        System.out.println(wd.getStateWaterDispenser().toString());
        System.out.println("***************************");
        System.out.println();

        smokeAlarm.setChanges(7,23);

        System.out.println();
        System.out.println("** Water Dispenser State **");
        System.out.println(wd.getStateWaterDispenser().toString());
        System.out.println("***************************");

    }
}
