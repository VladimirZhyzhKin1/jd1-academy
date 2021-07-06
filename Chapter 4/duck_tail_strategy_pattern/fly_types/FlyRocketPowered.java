package duck_tail_strategy_pattern.fly_types;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I am flying with a rocket!");
    }
}
