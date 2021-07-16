package collection;

import java.util.HashMap;
import java.util.Map;

public class Brr {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "Hello"); //первое ключ, второе значение
        hashMap.put("2", "Bye");
        hashMap.put("3", "Sleep");
        print(hashMap);
        System.out.println("После внесения в тот же ключ другого значения");
        hashMap.put("2", "Zamena na HELLO");//он просто переписывает на новое значени
        print(hashMap);
    }

    private static void print(Map<String, String> stringMap) {
        for (Map.Entry<String, String> entrySet : stringMap.entrySet()) {
            System.out.println("key : " + entrySet.getKey() + " value : " + entrySet.getValue());
        }
    }
}
