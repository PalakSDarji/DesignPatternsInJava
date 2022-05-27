package com.palak.designpatterns.structural.decorator.demo2;

public class BaseDecorator implements Notifier {

    Notifier notifier;

    BaseDecorator(Notifier c){
        notifier = c;
    }

    @Override
    public void sendMessage(String msg) {
        notifier.sendMessage(msg);
    }
}
