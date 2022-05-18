package com.palak.designpatterns.structural.decorator;

public class BarbecueBurgerDecorator extends BurgerDecorator{
    public BarbecueBurgerDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public void makeBurger() {
        burger.makeBurger();
        System.out.println(", vegies and cheese aded");
    }
}
