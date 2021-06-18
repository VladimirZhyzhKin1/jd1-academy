/*Задание 6
Создайте метод с одним целочисленным параметром.
 Метод должен определить, является ли последняя
 цифра числа семеркой и вернуть boolean значение.*/

public class Task6 {
    public static void lastNumeral(int value) {
        if (value % 10 == 7) {
            System.out.println("It is TRUE");
        } else {
            System.out.println("It is FALSE");
        }
    }

    public static void main(String[] args) {
        lastNumeral(587);
    }
}
