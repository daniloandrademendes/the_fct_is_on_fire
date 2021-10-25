public class WaterDispenserClass implements Observer,WaterDispenser {

    private boolean statusOn;
    private Subject smokeAlarm;
    private int smokeIntensity;


    public WaterDispenserClass(Subject smokeAlarm){
        this.smokeAlarm=smokeAlarm;
        this.smokeAlarm.registerObserver(this);
        statusOn=false;

    }
    @Override
    public void update(int smokeIntensity,float temperature) {
        this.smokeIntensity=smokeIntensity;
        if(smokeIntensity>=7){
            statusOn=true;
        turnwaterOn();
        }
        else if(statusOn && smokeIntensity<7){
            statusOn=false;
            turnWaterOff();
        }
    }
@Override
public void turnwaterOn(){
        System.out.println("water is falling");

    }
    @Override
    public void turnWaterOff(){
        System.out.println("water stopped falling");
    }

}
