package UseInterface;

public class Horse implements Animal {
    public final int numbLeg;

    public Horse(int numbLeg) {
        this.numbLeg = numbLeg;
    }

    @Override
    public void eat() {
        System.out.println("Лошадь кушает траву");
    }

    @Override
    public void travel() {
        System.out.println("Лошадь путешествует");

    }

    public void numbLeg() {
        if (numbLeg >= 4) {
            System.out.println("лошадь");
        } else {
            System.out.println("человек");
        }
    }
}
