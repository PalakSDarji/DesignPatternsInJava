package com.palak.designpatterns.structural.decorator.demo2;

public class NotifierImpl implements Notifier {
    @Override
    public void sendMessage(String msg) {
        System.out.println("Notifier sending msg : " + msg);
    }
}
