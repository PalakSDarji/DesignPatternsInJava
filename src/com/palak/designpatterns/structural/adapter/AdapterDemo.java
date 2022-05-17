package com.palak.designpatterns.structural.adapter;

public class AdapterDemo {
    public static void main(String[] args) {

        FrenchPerson frenchPerson = new FrenchPerson();
        FrenchToEnglishAdapter adapter = new FrenchToEnglishAdapter(frenchPerson);
        adapter.speakEnglish();

    }
}
