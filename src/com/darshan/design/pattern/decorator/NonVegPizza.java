package com.darshan.design.pattern.decorator;

public class NonVegPizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("baking non-Veg Pizza");
    }

    @Override
    public String getPizzaType() {
        return "non-Veg Pizza";
    }
}
