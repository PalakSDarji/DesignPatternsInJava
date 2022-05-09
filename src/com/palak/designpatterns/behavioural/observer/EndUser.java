package com.palak.designpatterns.behavioural.observer;

public class EndUser implements Observer{

    String name;

    public EndUser(String name, SubjectLibrary subject) {
        this.name = name;
        subject.subscribeObserver(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String avail) {
        System.out.println( "Hello " + name + "! your book is " + avail);
    }

    @Override
    public String toString() {
        return "EndUser{" +
                "name='" + name + '\'' +
                '}';
    }
}
