public class DisplayClass implements Observer, Display {
    private float temperature;

    @Override
    public void update(int smokeIntensity, float temperature) {
        this.temperature = temperature;
    }
    @Override
    public void display(){
        System.out.println("the current temperature is: " + temperature + " degrees");
    }
}
