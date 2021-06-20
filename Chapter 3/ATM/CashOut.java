public class CashOut {
    private final int numberOfBanknotes20;
    private final int numberOfBanknotes50;
    private final int numberOfBanknotes100;

    public CashOut(int numberOfBanknotes20, int numberOfBanknotes50, int numberOfBanknotes100) {

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

    @Override
    public String toString() {
        return "Выдана сумма"+ (numberOfBanknotes20*20+ numberOfBanknotes50*50 + numberOfBanknotes100*100)+ " [Банкноты 20р=" + numberOfBanknotes20 +" шт" + ", Банкноты 50р="
                + numberOfBanknotes50 +" шт"+ ", Банкноты 100р=" + numberOfBanknotes100 + "шт ]";
    }

    public int getSumm(){
        return numberOfBanknotes20*20+numberOfBanknotes50*50+numberOfBanknotes100*100;
    }


}
