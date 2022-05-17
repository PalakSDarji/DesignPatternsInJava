package com.palak.designpatterns.structural.adapter;

public class FrenchPerson implements ISpeakFrench{
    @Override
    public void speakFrench() {
        System.out.println("French french");
    }
}
