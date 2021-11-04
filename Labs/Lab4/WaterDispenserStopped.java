package Lab4;

public class WaterDispenserStopped implements WaterDispenserState {
    private WaterDispenser waterDispenser;

    public WaterDispenserStopped(WaterDispenser waterDispenser){
        this.waterDispenser = waterDispenser;
    }

    public void update(int intensity, float temperature) {
        if (intensity >= 7) {
            System.out.println("So much smoke! Starting water dispenser!");
            waterDispenser.dispenseWater();
        } else if (temperature > 70.0) {
            System.out.println("The room is so hot! Starting water dispenser!");
            waterDispenser.dispenseWater();
        } else {
            System.out.println("Everything cool and fresh!");
        }
    }

    public String toString(){
        return "Stopped";
    }
}
