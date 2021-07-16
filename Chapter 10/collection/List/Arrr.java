package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arrr {
    public static void main(String[] args) {
        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("hello");
        stringArrayList.add("goodbye");
        print(stringArrayList);

        List<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("Eat");
        stringLinkedList.add("Sleep");
        print(stringLinkedList);
    }

    public static void print(List<String> stringList) {
        for (String s : stringList) {
            System.out.println(s);
        }
    }

}
