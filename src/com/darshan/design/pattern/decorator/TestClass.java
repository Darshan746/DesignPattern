package com.darshan.design.pattern.decorator;

public class TestClass {

    public static void main(String[] args) {
        Pizza vegPizza = new VeggiePizza(new NormalPizza());
        vegPizza.bake();

        Pizza cheesePizza = new VeggiePizza(new NormalPizza());
        cheesePizza.bake();
    }
}
