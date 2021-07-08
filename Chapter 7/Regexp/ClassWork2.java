import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassWork2 {
    public static void main(String[] args) {
        // string regex - это шаблон по которому мы ищем регулярное выражение. точка знач
        String regex = "х?";
        Pattern pattern = Pattern.compile(regex);// создали шаблон в патерне

        String text = "Егор Алах опрнетар, А лламах могла бы, Ева но ушла Алегарх в лес";
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
