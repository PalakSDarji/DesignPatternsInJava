package com.palak.designpatterns.behavioural.observer;

public interface Observer<T extends Observable> {
    void update(T observable);
}
