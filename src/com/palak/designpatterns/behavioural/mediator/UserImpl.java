package com.palak.designpatterns.behavioural.mediator;

public class UserImpl extends User{

    public UserImpl(IMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " sending message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " received message: " + message);
    }
}
