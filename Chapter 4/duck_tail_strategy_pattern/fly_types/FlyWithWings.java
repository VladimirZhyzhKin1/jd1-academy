package duck_tail_strategy_pattern.fly_types;

public class FlyWithWings implements FlyBehavior{//реализация поведения для уток, которые умеют летать

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
