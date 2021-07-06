package duck_tail_strategy_pattern;

import duck_tail_strategy_pattern.fly_types.FlyNoWay;
import duck_tail_strategy_pattern.quack_type.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();//утка приманка изначально летать не умеет
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
