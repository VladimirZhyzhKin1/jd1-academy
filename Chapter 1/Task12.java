//Вычислить факториал целых чисел от 0 до 10 с помощью цикла while.
public class Task12 {
    public static void main(String[] args) {
        task12();
        System.out.println("Well done!");
    }

    public static void task12() {
        int h = 0;
        int factorial = 0;
        int i = 0;
        while (h <= 10) {
            factorial *= h;

            if (i <= 0) {
                factorial = 1;
            }
            System.out.println("Factorial is " + i + " = " + factorial);
            i++;
            h++;
        }
    }
}
