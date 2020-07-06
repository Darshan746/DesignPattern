package com.darshan.design.pattern.observer;

public interface Subject
{
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();

}
