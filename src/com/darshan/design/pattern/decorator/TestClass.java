package com.darshan.design.pattern.decorator;

public class TestClass {

    public static void main(String[] args) {
        Pizza vegPizza = new VeggiePizza();
        CheesePizza cheesePizza = new CheesePizza(vegPizza);
        cheesePizza.bake();

        Pizza nonVegPizza = new NonVegPizza();
        CheesePizza cheesePizza1 = new CheesePizza(nonVegPizza);
        cheesePizza1.bake();

    }
}
