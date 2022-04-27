package com.palak.designpatterns.creational.singleton;

public class LazySynchronizedSingleton {

    public static volatile LazySynchronizedSingleton INSTANCE;

    public static LazySynchronizedSingleton getInstance(){
        if(INSTANCE == null){
            synchronized (LazySynchronizedSingleton.class){
                if(INSTANCE == null){
                    INSTANCE = new LazySynchronizedSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
