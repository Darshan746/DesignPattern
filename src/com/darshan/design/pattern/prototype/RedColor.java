package com.darshan.design.pattern.prototype;

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
