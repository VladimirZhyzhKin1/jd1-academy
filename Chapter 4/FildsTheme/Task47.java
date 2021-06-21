package FildsTheme;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//Задание 47
//Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов. Вывести результат на экран.
public class Task47 {
    public static void main(String args[]) throws Exception {
        File file = new File("G:\\IdeaProjects\\homeWorkAll\\src\\FildsTheme\\Task47Text.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader words = new BufferedReader(fileReader);
        countWords(words);


        String line = words.readLine();
        Pattern pattern = Pattern.compile("[,.!:;?-]");
        countMarks(line, pattern);

    }

    private static void countWords(BufferedReader words) throws Exception {
        System.out.println("Counting Words:");
        String line = words.readLine();
        int count = 0;
        while (line != null) {
            String[] parts = line.split(" ");
            for (String w : parts) {
                count++;
            }
            line = words.readLine();
        }
        System.out.println(count);
    }
//Здесь у меня Ошибка не понимаю - почему она появляется?
    private static int countMarks(String line, Pattern pattern) {
        System.out.println("Counting Punctuation Marks:");
        Matcher matcher = pattern.matcher(line);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
