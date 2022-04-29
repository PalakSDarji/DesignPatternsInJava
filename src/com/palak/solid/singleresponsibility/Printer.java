package com.palak.solid.singleresponsibility;

class Printer {
    void print(Content c) {
        System.out.println("Printing via printer: " + c.text);
    }
}
