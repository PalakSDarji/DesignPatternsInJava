package com.palak.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonDemo {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        LazySingleton singleton = LazySingleton.getInstance();
        System.out.println("singleton : " + singleton.toString());

        //If we apply reflection, we can create multiple copy of singleton. Answer: YES
        Constructor constructor = singleton.getClass().getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);
        LazySingleton reflectedSingleton = (LazySingleton) constructor.newInstance();

        System.out.println("reflectedSingleton : " + reflectedSingleton);

        //Lets try with Enum Singleton.
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        System.out.println(enumSingleton);

        try{
            //If we apply reflection, we can create multiple copy of EnumSingleton. Answer: NO
            Constructor enumConstructor = enumSingleton.getClass().getDeclaredConstructor(new Class[0]);
            enumConstructor.setAccessible(true);
            EnumSingleton reflectedEnumSingleton = (EnumSingleton) enumConstructor.newInstance();
            System.out.println("reflectedEnumSingleton : " + reflectedEnumSingleton);
        } catch (Exception e){
            System.out.println("Can't create enum using reflection : " + e.getMessage());
        }

        //lets try with InnerStatic singleton
        InnerStaticSingleton innerStaticSingleton = InnerStaticSingleton.getInstance();
        System.out.println("innerStaticSingleton : " + innerStaticSingleton);

        //If we apply reflection, we can create multiple copy of InnerStaticSingleton. Answer: YES
        Constructor innerStaticConstructor = innerStaticSingleton.getClass().getDeclaredConstructor(new Class[0]);
        innerStaticConstructor.setAccessible(true);
        InnerStaticSingleton reflectedInnerStaticSingleton = (InnerStaticSingleton) innerStaticConstructor.newInstance();

        System.out.println("reflectedInnerStaticSingleton : " + reflectedInnerStaticSingleton);

    }
}