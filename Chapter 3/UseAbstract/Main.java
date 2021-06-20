package UseAbstract;

public class Main {
    public static void main(String[] args) {
        BookAbstract book = new Scientific("Java", "orange", 1525);
        //вызываем переопределенные методы
        book.typeBook();
        book.print();
    }
}
