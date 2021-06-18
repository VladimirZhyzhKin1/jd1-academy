/*Задание 4
Написать метод, который принимает на вход два целых числа,
делает их суммирование и складывает результат с произведением двух этих чисел,
 и возвращает полученный результат из метода. Передать на вход в метод любые два числа.
 Вывести полученный результат работы метода на экран.
* */

public class Task4 {
    private int operation;

    public int operation(int a, int b) {
        operation = (a + b) + (a * b);
        return operation;
    }

    public void printOperation() {
        System.out.println("Result of operation on numbers: " + operation);
    }

    public static void main(String[] args) {
        Task4 x = new Task4();
        x.operation(10, 18);
        x.printOperation();
    }
}
