package com.palak.solid.liskovsubstitution;

public class LiskovSubstitutionDemo {

    public static void main(String[] args) {

        Sparrow sparrow = new Sparrow();
        Ostrich ostrich = new Ostrich();

        sparrow.birdBehavior();
        sparrow.fly();

        ostrich.birdBehavior();
        //ostrich.fly(); not possible. not needed as well.
    }
}
