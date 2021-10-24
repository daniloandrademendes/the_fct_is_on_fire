public class EmailNotifier implements Observer {
    @Override
    public void update() {
        System.out.println("The email was sent: 'THE FCT IS ON FIRE!!!'");
    }
}
