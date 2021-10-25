public class DisplayClass implements Observer,Display {
    private Subject smokeAlarm;
    private float temperature;

    public DisplayClass(Subject smokeAlarm){
        this.smokeAlarm=smokeAlarm;
        this.smokeAlarm.registerObserver(this);
    }


    @Override
    public void update(int smokeIntensity,float temperature) {
        this.temperature=temperature;
    }
    @Override
    public void display(){
        System.out.println("the current temperature is: "+temperature+" degrees");
    }
}
