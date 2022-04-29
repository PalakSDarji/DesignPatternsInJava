package com.palak.solid.liskovsubstitution;

public class Ostrich extends Bird{

    @Override
    void birdBehavior() {
        super.birdBehavior();
        System.out.println("Ostrich has normal birdBehavior");
    }
}
