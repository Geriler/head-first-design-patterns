package com.geriler.Strategy.Fly;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("Утка не умеет летать");
    }
}
