package com.darshan.design.pattern.observer;

public class Person implements Observer
{
    private String personName;

    Person(String personName)
    {
        this.personName = personName;
    }

    @Override
    public void update(String availabality)
    {
        System.out.println("HI "+this.personName+ " "+"now the Product is "+availabality);
    }

}
