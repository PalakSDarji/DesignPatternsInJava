package com.palak.designpatterns.structural.proxy;

public class ActualImage implements Image{
    @Override
    public void displayImage() {
        System.out.println("A real image");
    }
}
