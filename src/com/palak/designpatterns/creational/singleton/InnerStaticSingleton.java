package com.palak.designpatterns.creational.singleton;

public class InnerStaticSingleton {

    private InnerStaticSingleton() { }

    private static class Singleton {
        static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
    }

    public static InnerStaticSingleton getInstance(){
        return Singleton.INSTANCE;
    }
}
