package duck_tail_strategy_pattern.fly_types;

public class FlyNoWay implements FlyBehavior{//реализация поведения для уток, которые не летают

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
