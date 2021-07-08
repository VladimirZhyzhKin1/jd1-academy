package AccountTest;

public class Account {
    private long amount;

    public Account(long amount) {
        this.amount = amount;
    }

    public void increase() {
        synchronized (this){} //
        amount++;
    }

    public synchronized void  decrease() {//это значит что с этим методом работает только один поток
        amount--;
    }

    @Override
    public String toString() {
        return "Account{" +
                "amount= " + amount +
                "}";

    }
}
