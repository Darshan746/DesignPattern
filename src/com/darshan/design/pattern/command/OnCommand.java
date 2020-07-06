package com.darshan.design.pattern.command;

public class OnCommand implements Command {

    Television television;

    OnCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.on();
    }
}

