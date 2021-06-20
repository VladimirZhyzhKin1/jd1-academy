public class ATMLogic {
    private static ATMLogic instance;

    private ATMLogic() {
    }



    public static ATMLogic getInstance() {
        if (instance == null)
            instance= new ATMLogic();
        return instance;
    }

    public int checkInput(int value, ATM atm){
        if (atm.getSumm()<value)
            return -1;
        else if (!(createTransaction(value,atm).getSumm()==value)||(value==10)
                ||(value==30))
            return 1;
        else return 0;
    }
    public void giveMoney(int value, ATM atm){
        atm.giveOutMoney(createTransaction(value,atm));
    }
    public CashOut createTransaction(int value, ATM atm){
       return CashOutLogic.getInstance().createCashOut(value, atm);
    }
}
