package convit;

public class DuckAdaptor implements Turkeylike {
    private final Ducklike duck;

    public DuckAdaptor(final Ducklike duck) {
        this.duck = duck;
    }

    public void gobble() {
        duck.quack(); // delegate to the quack method of the duck object
    }

    // Other methods of Turkeylike interface can be implemented if needed
}

