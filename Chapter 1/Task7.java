/*Задание 7
Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа.
 Определить, можно ли его полностью закрыть круглой картонкой радиусом r
  (тоже целое число).*/
public class Task7 {
    /*Радиус описанной окружности прямоугольника. Поскольку диагональ прямоугольника является
     диаметром описанной окружности, то формула радиус=(квадратный корень a2+b2)/2. */

    public static void checkTask7(int radius, int sideA, int sideB) {
        if (2 * radius >= Math.sqrt(sideA * sideA + sideB * sideB)) {
            System.out.println("Round cardboard covers our rectangular hole");
        } else {
            System.out.println("You need to take a larger round cardboard");
        }
    }

    public static void main(String[] args) {
        checkTask7(100, 120, 32);
    }
}
