package com.geriler.Strategy.Quack;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("<< писк резиновой уточки >>");
    }
}
