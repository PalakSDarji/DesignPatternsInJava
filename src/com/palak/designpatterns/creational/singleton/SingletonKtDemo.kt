package com.palak.designpatterns.creational.singleton

import java.lang.reflect.Constructor

fun main(){
    println("SingletonInKT : $SingletonInKT")

    //If we apply reflection, we can create multiple copy of SingletonInKT. Answer: YES
    val innerStaticConstructor: Constructor<*> =
        SingletonInKT.javaClass.getDeclaredConstructor(*arrayOfNulls<Class<*>>(0))
    innerStaticConstructor.isAccessible = true
    val reflectedSingletonInKT = innerStaticConstructor.newInstance() as SingletonInKT

    println("reflectedSingletonInKT : ${reflectedSingletonInKT}")

}