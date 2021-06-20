public class ATM {
    private int numberOfBanknotes20;
    private int numberOfBanknotes50;
    private int numberOfBanknotes100;

    public ATM(int numberOfBanknotes20, int numberOfBanknotes50, int numberOfBanknotes100) {
        this.numberOfBanknotes20 = numberOfBanknotes20;
        this.numberOfBanknotes50 = numberOfBanknotes50;
        this.numberOfBanknotes100 = numberOfBanknotes100;
    }

    public ATM() {
    }

    public ATM(CashIncome cashIncome) {
        this.numberOfBanknotes20 = cashIncome.getNumberOfBanknotes20();
        this.numberOfBanknotes50 = cashIncome.getNumberOfBanknotes50();
        this.numberOfBanknotes100 = cashIncome.getNumberOfBanknotes100();
    }

    public void addMoney(CashIncome cashIncome) {
        this.numberOfBanknotes20 += cashIncome.getNumberOfBanknotes20();
        this.numberOfBanknotes50 += cashIncome.getNumberOfBanknotes50();
        this.numberOfBanknotes100 += cashIncome.getNumberOfBanknotes100();
    }

    public void giveOutMoney(CashOut cashOut) {
        this.numberOfBanknotes20 -= cashOut.getNumberOfBanknotes20();
        this.numberOfBanknotes50 -= cashOut.getNumberOfBanknotes50();
        this.numberOfBanknotes100 -= cashOut.getNumberOfBanknotes100();
        System.out.println(cashOut);
        //view
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

    public int getSumm() {
        return numberOfBanknotes20 * 20 + numberOfBanknotes50 * 50 + numberOfBanknotes100 * 100;
    }

}
