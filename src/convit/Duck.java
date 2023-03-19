package convit;

public abstract class Duck {
    Flyable flyBehavior;
    Quackable quackBehavior;

    public Duck() {}

    public abstract void display();

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(Flyable fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(Quackable qb) {
        quackBehavior = qb;
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
