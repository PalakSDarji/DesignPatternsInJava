package com.palak.designpatterns.behavioural.observer;

public interface Observer {
    public <T> void update(T observable);
}
