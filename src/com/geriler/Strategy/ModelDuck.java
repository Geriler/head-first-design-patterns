package com.geriler.Strategy;

import com.geriler.Strategy.Fly.FlyNoWay;
import com.geriler.Strategy.Quack.MuteQuack;

public class ModelDuck extends Duck {
    public ModelDuck(String name) {
        super(name);
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
}
