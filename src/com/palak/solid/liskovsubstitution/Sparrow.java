package com.palak.solid.liskovsubstitution;

public class Sparrow extends FlyingBird{

    @Override
    void birdBehavior() {
        super.birdBehavior();
        System.out.println("Sparrow has normal bird behavior");
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Sparrow has flying behavior as well");
    }
}
