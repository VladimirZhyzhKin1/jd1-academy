package bookkeeping;

public class CompanyFactory {

    public static Company createCompany(int tax, int profit, String name) { //если у нас повторяется код, то выделяем эти строки и нажимаем Ctrl+Alt+M вызываем Извлечение метода и создаем метод для повторяющих манипуляций, нажимаем Refactor
        Company company = new Company(tax);
        company.setProfit(profit);
        company.setName(name);
        return company;
    }
    public static OAO createOAO(int tax, int roadTax, int profit, String name) {
        OAO oao = new OAO (tax, roadTax);
        oao.setProfit(profit);
        oao.setName(name);
        return oao;
    }
}
