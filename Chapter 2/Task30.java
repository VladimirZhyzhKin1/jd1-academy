
/*Задание 30
Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке всех тегов абзацев,
 в том числе тех, у которых есть параметры, например, <p id=”p1”>, и замену их на простые теги абзацев <p>.
 Результат работы метода выведите на экран.*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task30 {
    public static void main(String[] args) {
        Scanner stringText=new Scanner(System.in);
        System.out.println("Enter string:");
        String string = stringText.nextLine();
        stringText.close();

        Pattern patternCheck=Pattern.compile("<p.*?>"); //компилируется регулярное выражение
        Matcher matcher=patternCheck.matcher(string);
        string=matcher.replaceAll("<p>");
        System.out.println(string);

    }
}
