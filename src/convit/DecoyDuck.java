package convit;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        setFlyBehavior(new CannotFly());
        setQuackBehavior(new MuteQuack());
    }

    public void display() {
        System.out.println("I'm a Decoy Duck");
    }
}
