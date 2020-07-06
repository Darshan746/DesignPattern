package com.darshan.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject
{
    String productName;
    String available;
    List<Observer> observers = new ArrayList<Observer>();

    public Product(String productName, String available) {
        this.productName = productName;
        this.available = available;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public String getAvailable()
    {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
        if (available.equalsIgnoreCase("available")) {
            notifyObservers();
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer)
    {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers()
    {
        System.out.println("going to notify the Observer");
        for (Observer observer : observers) {
            observer.update(getAvailable()); }
    }

}
