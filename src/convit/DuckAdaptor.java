package convit;

public class DuckAdaptor implements Turkeylike {

    private final Ducklike duck;

    public DuckAdaptor(final Ducklike duck) {
        this.duck = duck;
    }

    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {

    }
}
