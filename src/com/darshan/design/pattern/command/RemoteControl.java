package com.darshan.design.pattern.command;

//used by the endUser/person
public class RemoteControl {

    Command command;

    public void pressButton(){
        command.execute();
    }


    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}


