package com.darshan.designPattern.PrototypeDesignPattern;

import java.util.Objects;

public class RedColor extends Color implements Cloneable
{
    public RedColor()
    {
        this.colorName = "red";
    }

    @Override
    String fillColor()
    {
        return "Am filling the red Color";

    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println("Heloooo");
        return super.clone();
    }

}
