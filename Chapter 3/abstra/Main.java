package abstra;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal hamster = new Hamster();
        eat(cat);
        eat(dog);
        eat(hamster);
        sound(cat);
        sound(dog);
        sound(hamster);
    }

    private static void eat(Animal animal) {//здесь описывается абстрактное (общее) поведение животного,
        // а уже в каждом классе реализуется персональное поведение
        animal.eat();
        if (animal instanceof Bite) {//здесь проверяется условие реализует ли animal interface Bite если да,
            // то выполняется метод из интерфейса
            ((Bite) animal).bite();
        }
    }

    private static void sound(Animal animal) {
        animal.sound();
    }

}
