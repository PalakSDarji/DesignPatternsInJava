package com.palak.designpatterns.behavioural.template;

public class Flipkart extends ProcessOrder{
    @Override
    public void selectProduct() {
        System.out.println("Flipkart selectProduct");
    }

    @Override
    public void makePayment() {
        System.out.println("Flipkart makePayment");
    }

    @Override
    public void deliver() {
        System.out.println("Flipkart deliver");
    }
}
