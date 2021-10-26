public class WaterDispenserStop extends WaterDispenser implements WaterDispenserState {


    public WaterDispenserStop(Subject smokeAlarm){
        super(smokeAlarm);
        smokeAlarm.registerObserver(this);
        super.setStateWaterDispenser(this);
    }

    public void turnWater(WaterDispenser state) {
        System.out.println("The water dispenser was stopped, no water is falling");
        state.setStateWaterDispenser(this);
    }

    public String toString(){
        return "Stopped";
    }
}
