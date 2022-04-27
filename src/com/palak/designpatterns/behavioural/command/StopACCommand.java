package com.palak.designpatterns.behavioural.command;

public class StopACCommand implements IACCommand{

    AC ac;

    StopACCommand(AC ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOff();
    }
}
