package com.palak.designpatterns.structural.decorator.demo2;

public class DecoratorDemo2 {
    public static void main(String[] args) {

        Notifier notifier = new SlackNotifier(new FbNotifier(new NotifierImpl()));
        notifier.sendMessage("Hi");
    }
}
