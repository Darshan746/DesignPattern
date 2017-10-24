package com.darshan.designPattern.ObserverDesignPattern;

public class ObserverDemo
{
    public static void main(String args[])
    {
        Person darshan = new Person("darshan");
        Person Pramod = new Person("pramod");

        Product galaxyNote8 = new Product("Galaxy Note8", "not Available");
        galaxyNote8.addObserver(darshan);
        galaxyNote8.addObserver(Pramod);

        galaxyNote8.setAvailable("Available");
    }
}