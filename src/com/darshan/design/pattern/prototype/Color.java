package com.darshan.design.pattern.prototype;

public abstract class Color implements Cloneable
{
    protected String colorName;

    abstract String fillColor();

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

}
