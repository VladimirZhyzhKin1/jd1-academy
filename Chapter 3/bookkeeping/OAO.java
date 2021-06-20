package bookkeeping;

public class OAO extends Company {
    private final int roadTax;
    public OAO(int tax, int roadTax) {
        super(tax);
        this.roadTax = roadTax;
    }

    public int getRoadTax() {
        return roadTax;
    }

   @Override
    public double calculateTax() {
        return super.calculateTax()+calculateRoadTaxValue();
    }


    public double calculateRoadTaxValue() {
        return getRoadTax()*getProfit()/100.0;
    }


    public double calculateProfitWithTax() {
        return getProfit() - calculateTax();
    }

    @Override
    public String toString() {
        return getName();
    }
}
