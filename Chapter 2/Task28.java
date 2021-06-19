import java.util.Scanner;
/*Задание 28
Введите с клавиатуры текст. Выведите на экран текст, составленный из последних букв всех слов из исходного текста.*/

public class Task28 {
    public static void main(String[] args) {

        Scanner enterText = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String text = enterText.nextLine();
        enterText.close();
        String[] share = text.split(" ");

        for (String s : share) {
            char lastSymbol = s.charAt(s.length() - 1);
            if (lastSymbol == '.' || lastSymbol == ','
                    || lastSymbol == '!' || lastSymbol == '?' || lastSymbol == ':'
                    || lastSymbol == '-' || lastSymbol == ';') {
                lastSymbol = s.charAt(s.length() - 2);
            }
            System.out.print(lastSymbol);
        }

    }

}
