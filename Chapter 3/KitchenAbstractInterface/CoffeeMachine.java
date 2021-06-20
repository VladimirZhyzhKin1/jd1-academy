package abstractInterface;

public class CoffeeMachine extends Appliances implements PlugInable {
    public CoffeeMachine() {
        super("Scishare Coffee Machine");
    }

    @Override
    public void iMake() {
        System.out.println(toString() + " Make good coffee");
    }

    @Override
    public void readySignal() {
        System.out.println(toString() + " Make signal is pshshshshsh");
    }

    @Override
    public void plugIn() {
        System.out.println("Plug in power socket. " + toString() + " is ON.");
    }
}
