package com.palak.designpatterns.behavioural.observer;

public interface Observable {

    public void subscribeObserver(Observer ob);

    public void unsubscribeObserver(Observer ob);

    public void notifyObserver();
}
