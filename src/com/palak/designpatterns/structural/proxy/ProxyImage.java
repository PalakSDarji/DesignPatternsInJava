package com.palak.designpatterns.structural.proxy;

//Protection Proxy
public class ProxyImage implements Image{

    ActualImage actualImage;

    @Override
    public void displayImage() {
        System.out.println("Checking access rights..");
        System.out.println("All good");
        actualImage = new ActualImage();
        actualImage.displayImage();
    }
}
