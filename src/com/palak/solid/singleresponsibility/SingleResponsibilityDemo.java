package com.palak.solid.singleresponsibility;

public class SingleResponsibilityDemo {

    public static void main(String[] args) {

        Content content = new Content();
        content.setContent("Palak");

        Printer printer = new Printer();
        printer.print(content);

    }
}

