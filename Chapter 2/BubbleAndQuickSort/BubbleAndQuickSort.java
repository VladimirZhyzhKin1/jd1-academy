package BubbleAndQuickSort;

import java.util.Arrays;

/*начиная с начала массива просматриваем попарно по 2 элемента (первый со вторым, второй с третим, третий с четвертым и т.д.).
Если второй элемент в паре меньше первого элемента – перемещаем его на место первого, а первый на место второго. Это мы делаем для всех элементов.
После того, как мы дошли до конца массива (сравнили предпоследний и последний элементы и сделали обмен, если нужно), проверяем, был ли хотя бы один обмен.
Если да, значит массив не отсортирован и начинаем все сначала. Повторяем такие проходы, пока не будет так, что мы проверили попарно все элементы от начала до конца,
 а обмена ни одного не было. Таким образом элементы с самыми маленькими значениями потихоньку перемещаются справа налево. То есть они как будто всплывают, как мыльный пузырь.
 Отсюда и название метода – пузырьком.
* */
public class BubbleAndQuickSort {
    public static void main(String[] args) {
        bubbleMethod();
    }

    private static void bubbleMethod() {
        System.out.println("Bubble Method of Sort");
        int[] array = {11, 3, 14, 16, 7};
        System.out.println("Given:");
        System.out.println(Arrays.toString(array));

        boolean isSorted = false;
        int mutable;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    mutable = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = mutable;
                }
            }
        }
        System.out.println("Result of sorted:");
        System.out.println(Arrays.toString(array));
    }
    public static class QuickSort{

        public static void quickSort(int[] array, int low, int high) {
            if (array.length == 0)
                return;//завершить выполнение если длина массива равна 0

            if (low >= high)
                return;//завершить выполнение если уже нечего делить

            // выбрать опорный элемент
            int middle = low + (high - low) / 2;
            int opora = array[middle];

            // разделить на подмассивы, который больше и меньше опорного элемента
            int i = low, j = high;
            while (i <= j) {
                while (array[i] < opora) {
                    i++;
                }

                while (array[j] > opora) {
                    j--;
                }

                if (i <= j) {//меняем местами
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i++;
                    j--;
                }
            }

            // вызов рекурсии для сортировки левой и правой части
            if (low < j)
                quickSort(array, low, j);

            if (high > i)
                quickSort(array, i, high);
        }
        public static void main(String[] args) {
            int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
            System.out.println("Было");
            System.out.println(Arrays.toString(x));

            int low = 0;
            int high = x.length - 1;

            quickSort(x, low, high);
            System.out.println("Стало");
            System.out.println(Arrays.toString(x));
        }
    }
}




