package com.darshan.design.pattern.decorator;

public class CheesePizza extends PizzaDecorator {

    CheesePizza(final Pizza pizza) {
        super(pizza);
        this.pizzaName = pizza.getPizzaType() + " with Cheese";
    }

    @Override
    public void bake() {
        System.out.println("Baking the " + pizzaName);
    }
}