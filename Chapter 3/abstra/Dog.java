package abstra;

public class Dog extends Animal implements Bite {

    public Dog() {
        super("Pedigree");
    }

    @Override
    public void sound() {
        System.out.println("Dog's sound Gav Gav");
    }

    @Override
    public void bite() {
        System.out.println("Dog is bite bite bite");
    }
}
