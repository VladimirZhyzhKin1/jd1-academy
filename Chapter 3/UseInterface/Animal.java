package UseInterface;

interface Animal {
    void eat();

    void travel();

    default void say() {
        System.out.println("ррррр");
    }
}
