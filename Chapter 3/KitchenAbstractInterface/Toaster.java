package abstractInterface;

public class Toaster extends CoffeeMachine {

    public Toaster() {
    }

    @Override
    public void iMake() {
        System.out.println(getClass().getName() + " make tasty bread");
    }

    @Override
    public void readySignal() {
        System.out.println(getClass().getName() + " play music");
    }

    @Override
    public void plugIn() {
        System.out.println(getClass().getName() + " is ON");
    }
}
