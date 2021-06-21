package ExceptionTheme;

import java.util.Map;
import java.util.TreeMap;

//Задание 43
//Написать код, который выбрасывает NullPointerException.
// Написать обработчик этого исключения и вывести на экран сообщение,
// которое будет содержать описание данного исключения.
public class Task43 {
    static Map map = new TreeMap();

    public static void main(String args[]) {

        try {
            System.out.println(map.get(null));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException. can't get value from TreeMap");
        }
    }
}