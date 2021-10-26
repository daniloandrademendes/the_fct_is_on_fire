public abstract class WaterDispenser implements Observer, WaterDispenserState {

    private Subject smokeAlarm;
    private WaterDispenser state;
    private int smokeIntensity;


    public WaterDispenser(Subject smokeAlarm){
        this.smokeAlarm=smokeAlarm;
    }


    @Override
    public void update(int smokeIntensity,float temperature) {
        this.smokeIntensity=smokeIntensity;
        if(smokeIntensity>=7) {
            WaterDispenserStart startToFall = new WaterDispenserStart(smokeAlarm);
            startToFall.turnWater(state);
        }

        else if(state instanceof WaterDispenserStart && smokeIntensity<7){
            WaterDispenserStop stopToFall = new WaterDispenserStop(smokeAlarm);
            stopToFall.turnWater(state);
        }
        setStateWaterDispenser(getStateWaterDispenser());
    }

    public void setStateWaterDispenser(WaterDispenser state) {
        this.state = state;
    }

    public WaterDispenser getStateWaterDispenser() {
        return state;
    }

    public abstract void turnWater(WaterDispenser state);
}
