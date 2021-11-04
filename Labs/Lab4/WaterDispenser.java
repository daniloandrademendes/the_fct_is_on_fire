package Lab4;

public class WaterDispenser implements Observer {

    private WaterDispenserState state;

    public WaterDispenser(SmokeAlarmSubject subject) {
        subject.registerObserver(this);
        state = new WaterDispenserStopped(this);
    }

    @Override
    public void update(int smokeIntensity, float temperature) {
        this.state.update(smokeIntensity, temperature);
    }

    public void dispenseWater() {
        System.out.println("The water started to fall!");
        this.setStateWaterDispenser(new WaterDispenserStarted(this));
    }

    public void stopDispenseWater() {
        System.out.println("The water stopped to fall!");
        this.setStateWaterDispenser(new WaterDispenserStopped(this));
    }

    public WaterDispenserState getStateWaterDispenser() {
        return state;
    }
    private void setStateWaterDispenser(WaterDispenserState state) {
        this.state = state;
    }
}
