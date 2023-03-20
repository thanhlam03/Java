package convit;

public abstract class Duck {
    Flyable flyBehavior;
    Quackable quackBehavior;

    public Duck() {}

    public abstract void display();

    public void performFly() {

        flyBehavior.fly();
    }

    public void performQuack() {

        quackBehavior.quack();
    }
    public void swim() {

        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(Flyable fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(Quackable qb){
        quackBehavior = qb;
    }
}
