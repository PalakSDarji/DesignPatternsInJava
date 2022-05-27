package com.palak.designpatterns.structural.decorator.demo2;

public class SlackNotifier extends BaseDecorator{
    SlackNotifier(Notifier c) {
        super(c);
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println("Sending " + msg + " on Slack");
        super.sendMessage(msg);
    }
}
