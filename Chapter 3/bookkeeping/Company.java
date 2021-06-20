package bookkeeping;

/*
 * класс для юридического лица
 * */
public class Company {
    //Налог
    private final int tax;
    //прибыль
    private int profit;
    //имя компании
    private String name;

    // указываю конструктором, как будет создаваться объект(экземпляр) класса с налогом
    public Company(int tax) {
        this.tax = tax;
    }

    public int getTax() {
        return tax;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    //высчитываем сумму налога
    public double calculateTax() {
        return tax * profit / 100.0;
    }

    //высчитываем чистую прибыль без налога
    public double calculateProfitWithTax() {
        return profit - calculateTax();
    }

    //присваиваю имя
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}