package com.palak.designpatterns.behavioural.observer;

import java.util.ArrayList;

public class Book implements Observable {

    private String name;
    private String author;
    private String inStock;
    private ArrayList<Observer> obList = new ArrayList<>();

    public Book(String name, String author, String inStock) {
        this.name = name;
        this.author = author;
        this.inStock = inStock;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
        notifyObserver();
    }

    public ArrayList<Observer> getObList() {
        return obList;
    }

    public void setObList(ArrayList<Observer> obList) {
        this.obList = obList;
    }

    @Override
    public void subscribeObserver(Observer ob) {
        obList.add(ob);
    }

    @Override
    public void unsubscribeObserver(Observer ob) {
        obList.remove(ob);
    }

    @Override
    public void notifyObserver() {
        System.out.println("Book name : "+ this.name +
                ", is now "+ this.inStock + ". So, please notify all the users.");

        for(Observer o : obList){
            o.update(this);
        }
    }

}
