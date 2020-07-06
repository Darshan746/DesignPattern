package com.darshan.design.pattern.command;

public class Person {

    public static void main(String[] args) {
        //Client first have to create the instance of reciever
        Television television = new Television();

        //create the instance of the invoker
        RemoteControl remoteControl = new RemoteControl();

        OnCommand onCommand = new OnCommand(television);
        OffCommand offCommand = new OffCommand(television);

        remoteControl.setCommand(onCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(offCommand);
        remoteControl.pressButton();


    }
}
