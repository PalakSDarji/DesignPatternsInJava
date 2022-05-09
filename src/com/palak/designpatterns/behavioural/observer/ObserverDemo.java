package com.palak.designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class ObserverDemo {
    public static void main(String[] args) {

        Book book = new Book("A monk who sold his ferrary","Robin Sharma","sold out");

        EndUser palak = new EndUser("Palak", book);
        EndUser dhara = new EndUser("Dhara", book);

        ArrayList<Observer> subscribers = book.getObList();

        for(Iterator<Observer> itr = subscribers.iterator(); itr. hasNext();){
            EndUser eu = (EndUser) itr.next();
            System.out.println(eu.getName() + " has subscribed for " + book.getName() + " Book");
        }

        System.out.println(book.getInStock());
        System.out.println("Book is in stock now.. notify all");
        book.setInStock("in stock");
    }
}
