package com.palak.designpatterns.structural.adapter;

public class FrenchToEnglishAdapter implements ISpeakEnglish{

    ISpeakFrench french;

    public FrenchToEnglishAdapter(ISpeakFrench french) {
        this.french = french;
    }

    @Override
    public void speakEnglish() {
        french.speakFrench();
        System.out.println("Coverting in brain..");
        System.out.println("English English");
    }
}
