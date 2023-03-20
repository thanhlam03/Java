package convit;

public class TurkeyAdaptor implements Ducklike {
    private final Turkeylike turkey;

    public TurkeyAdaptor(final Turkeylike turkey) {
        this.turkey = turkey;
    }

    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }

    public void quack() {
        turkey.gobble();
    }

    @Override
    public void display() {

    }

}
