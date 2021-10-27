public class WaterDispenserStart extends WaterDispenser implements WaterDispenserState{


     public WaterDispenserStart(Subject smokeAlarm){
         super(smokeAlarm);
         super.setStateWaterDispenser(this);
     }

    @Override
    public void turnWater(WaterDispenser state) {
        System.out.println("The water dispenser has started, water is falling");
        state.setStateWaterDispenser(this);
    }
    public String toString(){
        return "Started";
    }
}
