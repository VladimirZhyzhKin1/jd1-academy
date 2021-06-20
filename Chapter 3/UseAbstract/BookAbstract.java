package UseAbstract;

public abstract class BookAbstract {
    private final String nameBook;
    private final String color;


    public BookAbstract(String nameBook, String color) {
        this.nameBook = nameBook;
        this.color = color;
    }

    public abstract void typeBook();



    public void print() {
        System.out.println("Name: " + this.nameBook + " Color: " + this.color);
    }
}
