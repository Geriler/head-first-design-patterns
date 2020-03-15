package com.geriler.Strategy;

import com.geriler.Strategy.Fly.FlyBehavior;
import com.geriler.Strategy.Quack.QuackBehavior;

public abstract class Duck {
    String name;
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void swim() {
        System.out.println("Утка плавает");
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
