package com.palak.designpatterns.behavioural.command;

public class ACRemote {
    public void executeCommand(IACCommand iACCommand){
        iACCommand.execute();
    }
}
