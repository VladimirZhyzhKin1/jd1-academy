package duck_tail_strategy_pattern.quack_type;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
