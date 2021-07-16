package adf;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        System.out.println(strings);
        for (int i = 0; i < strings.size(); i++) {
            if (i == 1) {
                strings.remove(i);
                System.out.println();
            }
            System.out.println(strings.get(i));
        }
    }

}
