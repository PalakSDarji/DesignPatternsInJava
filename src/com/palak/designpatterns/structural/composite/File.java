package com.palak.designpatterns.structural.composite;

public class File implements Data {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void doubleClick() {
        System.out.println(this.getName() + " File is opened in a program...");
    }
}
