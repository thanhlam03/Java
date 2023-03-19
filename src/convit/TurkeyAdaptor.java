package convit;

public class TurkeyAdaptor implements Ducklike {
    private final Turkeylike turkey;

    public TurkeyAdaptor(final Turkeylike turkey) {
        this.turkey = turkey;
    }

    public void fly() {
        for (int i = 0; i < 5; i++) { // turkeys can only fly short distances
            turkey.fly();
        }
    }

    public void quack() {
        turkey.gobble(); // delegate to the gobble method of the turkey object
    }

    // Other methods of Ducklike interface can be implemented if needed
}
