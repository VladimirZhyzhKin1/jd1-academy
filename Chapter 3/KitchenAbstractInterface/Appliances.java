package abstractInterface;

public abstract class Appliances {
    private final String name;

    public Appliances(String name) {
        this.name = name;
    }

    public abstract void iMake();

    public abstract void readySignal();

    @Override
    public String toString() {
        return name;
    }
}
