package com.palak.designpatterns.behavioural.observer;

public class EndUser implements Observer{

    String name;

    public EndUser(String name, Observable subject) {
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
    public String toString() {
        return "EndUser{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public <Book> void update(Book book) {
        System.out.println( "Hello " + name + "! your book is " + book.getInStock());
    }
}
