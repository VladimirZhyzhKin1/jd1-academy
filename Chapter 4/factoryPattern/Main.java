package factoryPattern;
/*Задача
Реализовать интерфес у которого есть метод для суммировании строк.
Имплементировать этот интерфейс в три класса (Для работы со String, StringBuilder, StringBuffer)
и в каждом классе реализовать сложение строк 1000 раз. Соответственно для класса, который работает со String,
будут суммироваться строки через String, со StringBuffer - через StringBuffer, для StringBuilder - через StringBuilder.
Создать класс TestString, в который через конструктор передать одну из реализаций interface и написть метод,
который будет вызывать метод интерфейса для сложения строк с выводом временых интерваллов начало и конца работы метода.
Создание экземпляров этих классов реализовать через патерн фабрика.
в main для каждого класса вызвать этот метод через интерфейс*/

public class Main {
    public static void main(String[] args) {
        String addText = "aaabbbccc";
        int iteration = 1000;
        begin(addText, TestStringFactory.createSummOfString(AddOneThousandType.ADD_ONE_THOUSAND_STRING), iteration);
        begin(addText, TestStringFactory.createSummOfString(AddOneThousandType.ADD_ONE_THOUSAND_STRING_BUFFER), iteration);
        begin(addText, TestStringFactory.createSummOfString(AddOneThousandType.ADD_ONE_THOUSAND_STRING_BUILDER), iteration);
    }

    private static void begin(String addText, SummOfString summOfString, int iteration) {
        TestString test = new TestString(summOfString);
        test.timeOutput(addText, iteration);
    }
}
