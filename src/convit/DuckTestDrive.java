package convit;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.quack();
        mallard.fly();

        Duck model = new ModelDuck();
        model.display();
        model.setFlyBehavior(new FlyRocketPowered());
        model.fly();
    }
}
