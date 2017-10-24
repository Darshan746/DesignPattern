package com.darshan.designPattern.PrototypeDesignPattern;

public abstract class Color implements Cloneable
{
    protected String colorName;

    abstract String fillColor();

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

}
