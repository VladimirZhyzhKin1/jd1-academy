package duck_tail_strategy_pattern;

import duck_tail_strategy_pattern.fly_types.FlyRocketPowered;
import duck_tail_strategy_pattern.quack_type.Squeak;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        Squeak manok = new Manok();
        manok.quack();
    }
}
