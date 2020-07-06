package com.darshan.design.pattern.decorator;

public class NormalPizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("Baking the normal Pizza");
    }
}
