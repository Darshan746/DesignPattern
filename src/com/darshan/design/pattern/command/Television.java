package com.darshan.design.pattern.command;

//Reciever class which knows how to on and off the television
public class Television {

    public void on() {
        System.out.println("Television is ON");
    }

    public void off() {
        System.out.println("Television is OFF");
    }
}
