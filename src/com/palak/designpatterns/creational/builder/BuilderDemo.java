package com.palak.designpatterns.creational.builder;

public class BuilderDemo {
    public static void main(String[] args) {

        Mobile mobile = new Mobile.Builder()
                .setScreenSize("16")
                .setCompany("Apple")
                .build();

        System.out.println("Mobile : " + mobile);
    }
}