package Lab4;

public class Main {
    public static void main(String[] args) {
        SmokeAlarmSubject smokeAlarmSubject = new SmokeAlarmSubjectClass();
        SmokeAlarm smokeAlarm = new SmokeAlarmClass(smokeAlarmSubject);
        WaterDispenser wd = new WaterDispenser(smokeAlarmSubject);
        Observer temperatureDisplay = new DisplayClass(smokeAlarmSubject);

        System.out.println("** Water Dispenser State **");
        System.out.println(wd.getStateWaterDispenser().toString());
        System.out.println("***************************");
        System.out.println();

        smokeAlarm.setChanges(1,23); //water dispenser should be off

        System.out.println();
        System.out.println("** Water Dispenser State **");
        System.out.println(wd.getStateWaterDispenser().toString());
        System.out.println("***************************");

        smokeAlarm.setChanges(5,60);//water dispenser should be off

        System.out.println();
        System.out.println("** Water Dispenser State **");
        System.out.println(wd.getStateWaterDispenser().toString());
        System.out.println("***************************");

        smokeAlarm.setChanges(7,23);//water dispenser should turn on
        System.out.println();
        System.out.println("** Water Dispenser State **");
        System.out.println(wd.getStateWaterDispenser().toString());
        System.out.println("***************************");

        smokeAlarm.setChanges(6,23);//water dispenser should keep on
        System.out.println();
        System.out.println("** Water Dispenser State **");
        System.out.println(wd.getStateWaterDispenser().toString());
        System.out.println("***************************");

        smokeAlarm.setChanges(2,23);//water dispenser should turn off
        System.out.println();
        System.out.println("** Water Dispenser State **");
        System.out.println(wd.getStateWaterDispenser().toString());
        System.out.println("***************************");

        smokeAlarm.setChanges(2,80);//water dispenser should turn on
        System.out.println();
        System.out.println("** Water Dispenser State **");
        System.out.println(wd.getStateWaterDispenser().toString());
        System.out.println("***************************");
    }
}
