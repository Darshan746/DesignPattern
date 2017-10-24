package com.darshan.designPattern.PrototypeDesignPattern;

public class RedColor extends Color
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

}
