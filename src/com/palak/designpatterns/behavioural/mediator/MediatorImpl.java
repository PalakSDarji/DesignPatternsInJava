package com.palak.designpatterns.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements IMediator{

    private List<User> users;

    public MediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for(User u : this.users){
            if(u != user){
                u.receive(message);
            }
        }
    }

    @Override
    public void registerUser(User user) {
        this.users.add(user);
    }
}
