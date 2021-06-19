import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*Задание 29
Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке шестнадцатеричных чисел,
записанных по правилам Java, с помощью регулярных выражений. Результат работы метода выведите на экран.
*/

public class Task29 {

    public static void main(String[] args) {
        resultRegex();
    }

    public static void resultRegex() {
        Scanner enterText = new Scanner(System.in);
        System.out.println("Enter Text:");
        String string = enterText.nextLine();
        enterText.close();

        Pattern pattern = Pattern.compile("0[xX][A-Fa-f0-9]+");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
