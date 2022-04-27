package com.palak.designpatterns.behavioural.command;

public class AC {
    String acName;

    AC(String acName){
        this.acName = acName;
    }

    @Override
    public String toString() {
        return "AC{" +
                "acName='" + acName + '\'' +
                '}';
    }

    public void turnOn() {
        System.out.println("Starting " + acName + " AC");
    }

    public void turnOff() {
        System.out.println("stopping " + acName + " AC");
    }
}
