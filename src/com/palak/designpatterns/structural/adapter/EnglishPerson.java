package com.palak.designpatterns.structural.adapter;

public class EnglishPerson implements ISpeakEnglish{
    @Override
    public void speakEnglish() {
        System.out.println("English english");
    }
}
