package piza;
public class PizzaClient {
    public void run() {
        Pizza round = new Pizza(3.99, new Circle(2.5));
        Pizza rect = new Pizza(4.99, new Rectangle(6, 4));
        PizzaDeal pd = new PizzaDeal();
        System.out.println(round.getShape() + " is a better deal than " + rect.getShape() + ": " +
                pd.betterDeal(round, rect));
    }
    public static void main(String[] nu) {
        new PizzaClient().run();
    }
}