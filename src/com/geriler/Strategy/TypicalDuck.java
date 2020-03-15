package com.geriler.Strategy;

import com.geriler.Strategy.Fly.FlyWithWings;
import com.geriler.Strategy.Quack.Quack;

public class TypicalDuck extends Duck {
    public TypicalDuck(String name) {
        super(name);
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
