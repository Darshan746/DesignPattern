package com.darshan.designPattern.DecoratorDesignPattern;



public class CheesePizza extends PizzaDecorator {

    CheesePizza(Pizza pizza) {
        super(pizza);
        this.pizzaName = "CheesePizza";
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("Baking the Cheese Pizza");

    }
}