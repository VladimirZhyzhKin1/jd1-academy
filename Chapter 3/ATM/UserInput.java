import java.util.Scanner;

public class UserInput {
    private int value;
    private String notMoney = "Не достаточно денег в банкомате";
    private String notGetMoney = "Не могу выдать купюрами из наличия";
    private ATM atm;

    public ATM getAtm() {
        return atm;
    }

    public int getValue() {
        return value;
    }

    public int enterValue(ATM atm) {
        Scanner sr = new Scanner(System.in);
        do {
            System.out.println("Введите сумму денег:");
            while (!sr.hasNextInt()) { //после того как ввели что-то в консоль, проверяется на то, что вводное не символ
                System.out.println("Это не сумма денег, а символ");
                System.out.println("Введите новую сумму денег:");
                sr.next(); //после того как вводное определилось как символ-возвращает в начало do для повторного ввода суммы денег
            }
            value = sr.nextInt();
            if (value <= 0) {
                System.out.println("Введите положительное число!");
                value = -1;
            } else if (ATMLogic.getInstance().checkInput(value, atm) == -1) {//дальше проверяется вводное на положительность
                System.out.println(notMoney);
                value = -1;
            } else if (ATMLogic.getInstance().checkInput(value, atm) == 1) {
                System.out.println(notGetMoney);
                value = -1;
            }

        } while (value <= 0);//будет цикл do выполняться до тех пор пока сумма не будет введена положительной
        return value;
    }

    //проверка введеной суммы денег через консоль на кратность наличия банкнот (20, 50, 100)
    /*public checkInput(int value) {
        ATMLogic check = new ATMLogic();
        if (check.checkAmount = 0) {
            return value;
        } else {

        }
    }*/

}


