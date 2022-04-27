package com.palak.designpatterns.behavioural.command;

public class StartACCommand implements IACCommand{

    AC ac;

    StartACCommand(AC ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOn();
    }
}
