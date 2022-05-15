package com.palak.designpatterns.behavioural.template;

public class Shop extends ProcessOrder{
    @Override
    public void selectProduct() {
        System.out.println("Shop selectProduct");
    }

    @Override
    public void makePayment() {
        System.out.println("Shop makePayment");
    }

    @Override
    public void deliver() {
        System.out.println("Shop deliver");
    }
}
