package lamda;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
    public void printSomeNumber(FunctionalInterface funInter) {
        System.out.println(funInter.getSomeValue(15));
        System.out.println(funInter.getSomeValue(6));
    }

    public static void printSomeNumber1(FunctionalInterface funInter) {
        System.out.println(funInter.getSomeValue(10));
        System.out.println(funInter.getSomeValue(5));
    }

    public static void main(String[] args) {
        int limit = 10;
        FunctionalInterface funInt = (n) -> {
            int res = 0;
            for (int i = 0; i < n; i++) {
                res += i;
                if (i == limit) return res;
            }
            return res;
        };
        MyClass myClass = new MyClass();
        myClass.printSomeNumber(funInt);

        List<MyClass> myClasses = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myClasses.add(new MyClass());
        }
        myClasses.forEach(MyClass::printSomeNumber1);
    }

    private static void printSomeNumber1(MyClass myClass) {
    }
}
