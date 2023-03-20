package convit;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new CannotFly();
        quackBehavior = new DuckCall();
    }

    public void display() {

        System.out.println("Tôi là vịt cao su");
    }
}
