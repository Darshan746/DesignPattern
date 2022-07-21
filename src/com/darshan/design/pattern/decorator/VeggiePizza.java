package com.darshan.design.pattern.decorator;

public class VeggiePizza implements Pizza {

    @Override
    public String getPizzaType() {
        return "VegPizza";
    }

    @Override
    public void bake() {
        System.out.println("baking the veg Pizza!");
    }
}
