package com.palak.designpatterns.behavioural.mediator;

abstract public class User {
    protected IMediator mediator;
    protected String name;

    public User(IMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    abstract public void send(String message);
    abstract public void receive(String message);
}
