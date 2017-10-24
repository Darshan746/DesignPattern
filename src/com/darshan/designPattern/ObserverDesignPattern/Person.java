package com.darshan.designPattern.ObserverDesignPattern;

public class Person implements Observer
{

    String personName;

    public Person(String personName)
    {
        this.personName = personName;
    }

    @Override
    public void update(String availabality)
    {
        System.out.println("HI "+this.personName+ " "+"now the Product is "+availabality);
    }

}
