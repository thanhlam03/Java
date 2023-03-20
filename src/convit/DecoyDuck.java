package convit;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyRocketPowered();
        quackBehavior = new Squeak();
    }

    public void display() {

        System.out.println("Tôi là vịt mồi ");
    }
}
