package com.darshan.design.pattern.decorator;

public class VeggiePizza extends PizzaDecorator {

    VeggiePizza(Pizza pizza) {
        super(pizza);
        this.pizzaName = "veggiPizza";
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("Baking the Veg Pizza");

    }
}
