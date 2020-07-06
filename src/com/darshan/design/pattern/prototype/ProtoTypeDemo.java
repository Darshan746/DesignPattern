package com.darshan.design.pattern.prototype;

public class ProtoTypeDemo
{

    public static void main(String args[]) throws CloneNotSupportedException
    {
        Color redColor = new RedColor();
        Color clonedRedColor = (Color) redColor.clone();
        System.out.println("Am printing the redColor :" + redColor.fillColor());
        System.out.println("Am printing the clonedRedColor: " + clonedRedColor.fillColor());

        Color greenColor = new GreenColor();
        Color clonedGreenColor = (Color) greenColor.clone();
        System.out.println("Am printing the redColor: " + greenColor.fillColor());
        System.out.println("Am printing the clonedGreenColor: " + clonedGreenColor.fillColor());

    }
}
