import java.util.Scanner;

/*Задание 26
Введите с клавиатуры строку. Найти в строке не только запятые,
но и другие знаки препинания. Подсчитать общее их количество.
*/
public class Task26 {
    public static void main(String[] args) {

        Scanner inputText = new Scanner(System.in);
        System.out.println("Введите с клавиатуры текст: ");
        /*Здравствуйте! не хотите ли поговорить о своем поведении? Прошу вас,пожалуйста, уберите ноги со стола. Именно: одну, две, три - вы мутант?*/
        String text = inputText.nextLine();
        System.out.println(text);
        int numberOfPunctuationMarks = 0;
        char symbol;
        for (int i = 0; i < text.length(); i++) {
            symbol = text.charAt(i);
            if (symbol == '.' || symbol == ',' || symbol == '!' || symbol == '?' || symbol == ':' || symbol == '-' || symbol == ';') {
                numberOfPunctuationMarks++;
            }
        }
        System.out.println("Количество знаков препинания равно: " + numberOfPunctuationMarks);

    }
}
