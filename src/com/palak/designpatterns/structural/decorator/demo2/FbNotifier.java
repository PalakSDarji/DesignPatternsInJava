package com.palak.designpatterns.structural.decorator.demo2;

public class FbNotifier extends BaseDecorator{

    FbNotifier(Notifier c) {
        super(c);
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println("Sending " + msg + " on FB");
        super.sendMessage(msg);
    }
}
