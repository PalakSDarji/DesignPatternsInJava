package com.palak.designpatterns.behavioural.mediator;

public interface IMediator {
    public void sendMessage(String message, User user);
    public void registerUser(User user);
}
