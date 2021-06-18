/*Задание 8
Задать целое число в виде переменной, это число – сумма денег в рублях.
Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже.*/
public class Task8 {

    public void output(int money) {
        int x = money % 10;
        if (money % 100 >= 11 && money % 100 <= 14) {
            System.out.println(money + " рублей");
        } else {
            switch (x) {
                case 1:
                    System.out.println(money + " рубль");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(money + " рубля");
                    break;
                default:
                    System.out.println(money + " рублей");

            }
        }
    }

    public static void main(String[] args) {
        Task8 g = new Task8();
        g.output(1254);
        g.output(2551);
        g.output(655);
    }
}

