package com.darshan.designPattern.DecoratorDesignPattern;

public class TestClass {

    public static void main(String[] args) {
        Pizza vegPizza = new VeggiePizza(new NormalPizza());
        vegPizza.bake();

        Pizza cheesePizza = new VeggiePizza(new NormalPizza());
        cheesePizza.bake();
    }
}
