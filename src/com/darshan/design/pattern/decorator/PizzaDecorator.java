package com.darshan.design.pattern.decorator;

public class PizzaDecorator implements Pizza {

    private Pizza pizza;
    public String pizzaName;

    PizzaDecorator(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    public void bake() {
        System.out.println("baking Pizza:");
    }
}
