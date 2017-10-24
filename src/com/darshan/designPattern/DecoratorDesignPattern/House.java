package com.darshan.designPattern.DecoratorDesignPattern;

public abstract class House
{

    private String description = "Plain house";

    public abstract double getPrice();

    public String getDescription()
    {
        return description;
    }
}
