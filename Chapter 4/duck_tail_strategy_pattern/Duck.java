package duck_tail_strategy_pattern;

import duck_tail_strategy_pattern.fly_types.FlyBehavior;
import duck_tail_strategy_pattern.quack_type.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void swim(){
        System.out.println("All ducks float, even decoys");
    }

    public abstract void display();

    public void performQuack(){//делегирование операции классам поведения
        quackBehavior.quack();
    }

    public void performFly(){//делегирование операции классам поведения
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    
    public void setQuackBehavior (QuackBehavior qb){
        quackBehavior = qb;
    }
}
