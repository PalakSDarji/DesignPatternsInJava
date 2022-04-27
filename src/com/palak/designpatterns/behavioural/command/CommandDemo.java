package com.palak.designpatterns.behavioural.command;

public class CommandDemo {

    public static void main(String[] args) {

        AC ac1 = new AC("BedRoom");
        AC ac2 = new AC("Office");

        ACRemote acRemote = new ACRemote();
        acRemote.executeCommand(new StartACCommand(ac1));
        acRemote.executeCommand(new StopACCommand(ac1));
        acRemote.executeCommand(new StartACCommand(ac2));
        acRemote.executeCommand(new StopACCommand(ac2));

    }
}
