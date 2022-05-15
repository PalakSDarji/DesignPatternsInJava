package com.palak.designpatterns.behavioural.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context();
        context.setCompressionStrategy(new CompressToRar());
        context.generateFile("file1");

        context.setCompressionStrategy(new CompressToZip());
        context.generateFile("file1");
    }
}
