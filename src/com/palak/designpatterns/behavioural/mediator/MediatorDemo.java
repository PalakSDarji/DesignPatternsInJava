package com.palak.designpatterns.behavioural.mediator;

public class MediatorDemo {
    public static void main(String[] args) {

        IMediator mediator = new MediatorImpl();

        User palak = new UserImpl(mediator,"Palak");
        mediator.registerUser(palak);

        User dhara = new UserImpl(mediator,"Dhara");
        mediator.registerUser(dhara);

        User hiya = new UserImpl(mediator,"Hiya");
        mediator.registerUser(hiya);

        palak.send("Hi All");
        dhara.send("Hey everyone");
        hiya.send("Great guys");
    }
}
