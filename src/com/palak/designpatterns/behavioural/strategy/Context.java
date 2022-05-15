package com.palak.designpatterns.behavioural.strategy;

public class Context {
    Strategy compressionStrategy;

    public void setCompressionStrategy(Strategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    void generateFile(String file){
        compressionStrategy.compressFile(file);
    }
}
