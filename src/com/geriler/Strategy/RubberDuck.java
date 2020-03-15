package com.geriler.Strategy;

import com.geriler.Strategy.Fly.FlyNoWay;
import com.geriler.Strategy.Quack.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck(String name) {
        super(name);
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
}
