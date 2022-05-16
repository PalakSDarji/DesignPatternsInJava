package com.palak.designpatterns.behavioural.visitor.demo2;

public interface Visitor<T> {
    void visit(Visitable visitable);
}
