package convit;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new CannotQuack();
    }

    public void display() {

        System.out.println(" Tôi là vịt đầu đỏ");
    }
}
