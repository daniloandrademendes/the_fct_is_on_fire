package Lab4;

public class DisplayClass implements Observer, Display {
    private float temperature;

    public DisplayClass(SmokeAlarmSubject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(int smokeIntensity, float temperature) {
        this.temperature = temperature;
        this.display();
    }
    @Override
    public void display(){
        System.out.println("the current temperature is: " + temperature + " degrees");
    }
}
