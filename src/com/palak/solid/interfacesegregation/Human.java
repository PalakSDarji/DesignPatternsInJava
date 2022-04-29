package com.palak.solid.interfacesegregation;

public class Human implements Sleeper, Worker{
    @Override
    public void sleep() {
        System.out.println("Human sleeps");
    }

    @Override
    public void work() {
        System.out.println("Human works");
    }
}
