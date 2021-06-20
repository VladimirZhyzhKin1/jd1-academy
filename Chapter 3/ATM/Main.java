public class Main {
        public static void main(String[] args) {
            ATM atm = new ATM(new CashIncome(5,1,2));
            ATMLogic.getInstance().giveMoney(new UserInput().enterValue(atm),atm);
        }
}
