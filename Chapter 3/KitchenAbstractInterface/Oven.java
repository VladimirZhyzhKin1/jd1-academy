package abstractInterface;

public class Oven extends Appliances {
    public Oven() {
        super("Bosh");
    }

    @Override
    public void iMake() {
        System.out.println(toString() + " Make tasty food");
    }

    @Override
    public void readySignal() {
        System.out.println(toString() + " Make signal is piK-piK-piK");
    }

}
