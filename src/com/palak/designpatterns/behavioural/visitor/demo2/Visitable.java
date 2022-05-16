package com.palak.designpatterns.behavioural.visitor.demo2;

public interface Visitable<T> {
    void accept(Visitor visitor);
}
