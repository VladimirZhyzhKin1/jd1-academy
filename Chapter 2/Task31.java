

/*Задание 31
Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”,
один с помощью оператора сложения и String, а другой с помощью StringBuilder и метода append.
 Сравните скорость их выполнения. Выведите сравнение на экран.*/

public class Task31 {
    public static void main(String[] args) {
        long startTime;
        long endTime;
        long totalTimeString;
        long totalTimeStringBuilder;

        startTime = System.nanoTime();
        addMillionString();
        endTime = System.nanoTime();
        totalTimeString = endTime - startTime;

        startTime = System.nanoTime();
        addMillionStringBuilder();
        endTime = System.nanoTime();
        totalTimeStringBuilder = endTime - startTime;

        System.out.println("Total result work addMillionString: " + totalTimeString);
        System.out.println("Total result work addMillionStringBuilder: " + totalTimeStringBuilder);
        System.out.println("Comparison: " + (totalTimeString - totalTimeStringBuilder));

    }

    public static void addMillionString() {
        String a = "aaabbbccc";
        String b = "";

        int i = 0;
        while (i <= 1000000) {
            b = a + b;
            i++;
        }
    }

    public static void addMillionStringBuilder() {
        String x = "aaabbbccc";
        StringBuilder stringBuilder = new StringBuilder("aaabbbccc");
        for (int i = 0; i <= 1000000; i++) {
            stringBuilder.append(x);
        }
    }

}

