package com.palak.designpatterns.behavioural.strategy;

public class CompressToRar implements Strategy{
    @Override
    public void compressFile(String fileName) {
        System.out.println(fileName +" has been converted to RAR");
    }
}
