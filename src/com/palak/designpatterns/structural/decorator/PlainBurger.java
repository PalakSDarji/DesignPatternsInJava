package com.palak.designpatterns.structural.decorator;

public class PlainBurger implements Burger{
    @Override
    public void makeBurger() {
        System.out.println("Plain burger is ready");
    }
}
