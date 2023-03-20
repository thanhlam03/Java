package convit;

public class CannotQuack implements Quackable{
    @Override
    public void quack() {
        System.out.println("<< im lặng >>");
    }
}
