package abstra;

public class Cat extends Animal implements Bite {

    public Cat() {
        super("Wiskas");
    }

    @Override
    public void sound() {
        System.out.println("Cat's sound Mur Mur");
    }

    @Override
    public void bite() {
        System.out.println("Cat is bite bite bite");
    }
}
