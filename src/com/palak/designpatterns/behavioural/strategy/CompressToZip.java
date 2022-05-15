package com.palak.designpatterns.behavioural.strategy;

public class CompressToZip implements Strategy{
    @Override
    public void compressFile(String fileName) {
        System.out.println(fileName +" has been converted to ZIP");
    }
}
