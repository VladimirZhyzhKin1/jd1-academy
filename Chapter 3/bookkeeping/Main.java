package bookkeeping;

public class Main {
    public static void main(String[] args) {
        calculateBalance(CompanyFactory.createCompany(5, 1800, "Веселый мир"));
        calculateBalance(CompanyFactory.createCompany(20, 2500, "Обкуренный дом"));
        calculateBalance(CompanyFactory.createCompany(34, 3600, "Кривая арматура"));



        calculateBalance(CompanyFactory.createOAO(28, 10, 1000, "Litana ir Ko"));
    }

    private static void calculateBalance(Company company) {
        print(company);
    }

    private static void print(Company company) {
        System.out.println();
        System.out.println(company); /* если я сошлюсь на переменную компани из методов будет на выходе
        тянуться адрес объекта (экземпляра) из ссылки на которую направлена при создании объекта при помощи "new"
        надо вызывать наим. комп. company.getName
        глядя на этот случай у компании ОАО будет вывадиться Litana ir Ko
        т.к. в классе ОАО я переопределил методом toString*/
        System.out.println("Налог:" + company.getTax() + "%");
        System.out.println("Прибыль:" + company.getProfit());
        System.out.println("Чистая прибыль: " + company.calculateProfitWithTax());
    }
}
