public class WaterDispenserStarted implements WaterDispenserState {
    private WaterDispenser waterDispenser;

    public WaterDispenserStarted(WaterDispenser waterDispenser){
        this.waterDispenser = waterDispenser;
    }

    public void update(int intensity, float temperature) {
        if (intensity > 2) {
            System.out.println("So much smoke! Still dispensing water!");
        } else if (temperature > 50.0) {
            System.out.println("The room is still hot! Still dispensing water!");
        } else {
            System.out.println("The water is no longer necessary. Stopping!");
            waterDispenser.stopDispenseWater();
        }
    }

    public String toString(){
        return "Started";
    }
}
