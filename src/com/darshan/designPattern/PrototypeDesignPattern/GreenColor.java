package com.darshan.designPattern.PrototypeDesignPattern;

public class GreenColor extends Color
{

    public GreenColor()
    {
        this.colorName = "green";
    }
    @Override
    String fillColor()
    {
        return "Am filling the Green color";
        
    }

}
