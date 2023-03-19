package convit;

public class RubberDuck extends Duck {
    public RubberDuck() {
        setFlyBehavior(new CannotFly());
        setQuackBehavior(new Squeak());
    }

    public void display() {
        System.out.println("I'm a Rubber Duck");
    }
}
