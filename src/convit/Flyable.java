package convit;

public interface Flyable {
    void fly();
}

public interface Ducklike {
    void swim();
    void display();
}

public abstract class Duck implements Ducklike, Flyable {
    Flyable flyBehavior;
    Quackable quackBehavior;

    public Duck() {}

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
}
