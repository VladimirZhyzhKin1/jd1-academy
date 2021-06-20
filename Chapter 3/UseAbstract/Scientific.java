package UseAbstract;

public class Scientific extends BookAbstract {
    private final int numbPage;

    public Scientific(String nameBook, String color, int numbPage) {
        super(nameBook, color);
        this.numbPage = numbPage;
    }

    @Override
    public void typeBook() {
        if (numbPage >= 1200) {
            System.out.println("The book is big");
        } else {
            System.out.println("The book is small");
        }
    }
}
