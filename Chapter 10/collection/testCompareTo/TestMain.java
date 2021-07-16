package testCompareTo;

import java.util.Set;
import java.util.TreeSet;

public class TestMain {
    public static void main(String[] args) {
        Set<TestCompareTo> keyMapSet = new TreeSet<>();
        keyMapSet.add(new TestCompareTo(2, 6));
        keyMapSet.add(new TestCompareTo(1, 5));
        keyMapSet.add(new TestCompareTo(4, 8));
        keyMapSet.forEach(System.out::println);
    }
}
