import java.util.Scanner;

/*Задание 27
Введите с клавиатуры текст.
Подсчитать количество слов в тексте.
Учесть, что слова могут разделяться несколькими пробелами,
 в начале и конце текста также могут быть пробелы, но могут и отсутствовать.
*/
public class Task27 {

    public static void main(String[] args) {
        Scanner enterText = new Scanner(System.in);
        System.out.println("Your Text: "); /*Здравствуйте! не хотите ли поговорить о своем поведении?*/
        String text = enterText.nextLine();
        enterText.close();
        for (String share : text.split(" ")) { //разделяю строку на слова (какя понимаю, что это слова, т.к. разделены пробелом)
            System.out.println(share);
        }
        System.out.println("Количество слов в строке: " + text.split(" ").length);
    }

}

