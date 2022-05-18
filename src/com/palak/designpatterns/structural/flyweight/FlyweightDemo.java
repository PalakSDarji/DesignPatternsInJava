package com.palak.designpatterns.structural.flyweight;

public class FlyweightDemo {
    public static void main(String[] args) {

        Bucket bucket = new Bucket();
        bucket.executeOrder("Macbook", 1);
        bucket.executeOrder("Moto", 2);
        bucket.executeOrder("Moto", 3);
        bucket.process();
        System.out.println(bucket.getTotalProducts());
    }
}
