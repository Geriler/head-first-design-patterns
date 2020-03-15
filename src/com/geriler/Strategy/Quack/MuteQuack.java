package com.geriler.Strategy.Quack;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< тишина >>");
    }
}
