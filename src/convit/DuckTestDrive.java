package convit;

public class DuckTestDrive extends Duck{
    public DuckTestDrive(){
        flyBehavior = new CannotFly();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Duck Test Drive");
    }
}
