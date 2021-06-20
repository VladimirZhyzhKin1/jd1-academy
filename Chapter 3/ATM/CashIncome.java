public class CashIncome {
    private final int numberOfBanknotes20;
    private final int numberOfBanknotes50;
    private final int numberOfBanknotes100;

    public CashIncome(int numberOfBanknotes20, int numberOfBanknotes50, int numberOfBanknotes100) {
        this.numberOfBanknotes20 = numberOfBanknotes20;
        this.numberOfBanknotes50 = numberOfBanknotes50;
        this.numberOfBanknotes100 = numberOfBanknotes100;
    }

    public int getNumberOfBanknotes20() {
        return numberOfBanknotes20;
    }

    public int getNumberOfBanknotes50() {
        return numberOfBanknotes50;
    }

    public int getNumberOfBanknotes100() {
        return numberOfBanknotes100;
    }
}
