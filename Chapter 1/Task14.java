//Задание 14
//Посчитать сумму цифр числа 7893823445 с помощью цикла do while.

public class Task14 {
    public static void main(String[] args) {
        long value = 7893823445L;
        System.out.println(sumValue(value));
    }

    public static int sumValue(long value) {
        int sum = 0;
        int tenNumber = 10;
        do {
            sum = sum + (int) (value % tenNumber);
            value = value / tenNumber;
        } while (value != 0);
        return sum;
    }
}
