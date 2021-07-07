//break
//Напишем несложную программу, которая сосчитает количество чисел,
//сумма которых не должна первышать 300 и каждое следующее больше предыдущего на 10.
//Начальное число будет равно 1.

public class BreakFist {
    public static void main(String[] args) {
        //breakUse();//
        //continueUse();//continue, давайте напечатаем только нечетные числа от 0 до 20
        //ifElseUse();//if-else//Напечатать Квадрат. Условием печати «*» будет совпадение значение переменных цикла i и k с крайними значениями. // А это либо 0, либо count-1 (именно count-1, а не просто count)
        //triangle();//прямоугольный треугольник, прямая сторона - слева
        //task1();//квадрат с диагоналями
        //task2();//прямоугольный треугольник, прямая сторона - справа
        task3();
    }

    private static void task3() {
        System.out.println("Ромб");
        int count = 11;
        for (int i = 0; i < count; i++) {
            if (i > count / 2) {
                for (int j = 0; j < count - i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static void task2() {
        int count = 11;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (j == count - i - 1 || j == count - 1 || i == count - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void task1() {
        int count = 11;
        //внешний цикл
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i == j || j == count - i - 1 || j == count - 1 || i == count - 1 || j == 0 || i == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //переход на следующую строку
            System.out.println();
        }
    }


    private static void triangle() {
        int count = 4;
        //внешний цикл
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i || i == count - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //переход на следующую строку
            System.out.println();
        }
    }

    private static void ifElseUse() {
        int count = 10;
        //внешний цикл
        for (int i = 0; i < count; i++) {
            //внутренний цикл для печати одной строки
            for (int j = 0; j < count; j++) {
                //вот наше сложное условие
                if (j == 0 || j == count - 1 || i == 0 || i == count - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //переход на следующую строку
            System.out.println();
        }
    }

    private static void continueUse() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {//число четное
                continue;//переходим в начало цикла
            }
            System.out.println("Number = " + i); //оператор исполняется только для нечетных чисел
        }
    }

    private static void breakUse() {
        int number = 1;//начальное число
        int sum = 0;//переменная для хранения суммы
        int count = 0;//количество чисел-в начале ниодного
        int max = 300;//предел суммы
        for (; ; ) {
            sum += number;//увеличиваем сумму
            if (sum > max) {//проверяем сумму - если больше
                break;//То это является точкой выхода
            } else {
                count++;//А здесь просто увеличиваем количество чисел
            }
            number += 10;//увеличиваем число на 10
        }
        System.out.println("Count = " + count);
    }
}
