package com.palak.solid.interfacesegregation;

public class Robot implements Worker{
    @Override
    public void work() {
        System.out.println("Robot works");
    }
}
