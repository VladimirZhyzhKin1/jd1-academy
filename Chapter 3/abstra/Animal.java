package abstra;

public abstract class Animal {
    private final String food;

    public Animal(String food) {
        this.food = food;
    }

    public void eat() {
        System.out.println(getClass().getName() + " is food " + food);
    }

    public abstract void sound();
}

