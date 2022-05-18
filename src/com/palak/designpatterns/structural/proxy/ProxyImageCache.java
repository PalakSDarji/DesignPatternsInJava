package com.palak.designpatterns.structural.proxy;

//Remote Proxy
public class ProxyImageCache implements Image{

    ActualImage actualImage;

    @Override
    public void displayImage() {
        System.out.println("Object is not there in cache..");
        actualImage = new ActualImage();
        actualImage.displayImage();
    }
}
