

public class CashOutLogic {
    // private int[] numbersOfBanknots = new int[3];
    private static final CashOutLogic instance = new CashOutLogic();
    private CashOutLogic() {

    }

    public static CashOutLogic getInstance() {
        return instance;
    }

    public CashOut createCashOut(int value, ATM atm) {
        int[] banknots = divideByBanknots(value, atm);

        return new CashOut(banknots[2], banknots[1], banknots[0]);
    }

    private int[] divideByBanknots(int value, ATM atm) {
        int[] banknots = new int[3];
        if(canDivide(value, 100)) {
            banknots[0] = (value/100)-1;

        } else {
            banknots[0] = value/100;
        }
        if(banknots[0] > atm.getNumberOfBanknotes100()) {
            banknots[0]=atm.getNumberOfBanknotes100();
        }
        if(canDivide((value-banknots[0] *100),50)) {
            banknots[1] = (value-banknots[0] *100)/50-1;
        } else {
            banknots[1] = (value-banknots[0] *100)/50;
        }
        if(banknots[1] > atm.getNumberOfBanknotes50()) {
            banknots[1] = atm.getNumberOfBanknotes50();
        }

        banknots[2] =  (value-banknots[0] *100 - banknots[1]*50)/20;
        if(banknots[2] > atm.getNumberOfBanknotes20()) {
            banknots[2] = atm.getNumberOfBanknotes20();
        }

        return banknots;

    }

    private boolean canDivide(int value, int divider) {
        if (value % divider == 10 || value % divider == 30) {
            return true;
        } else {
            return false;
        }
    }

}

