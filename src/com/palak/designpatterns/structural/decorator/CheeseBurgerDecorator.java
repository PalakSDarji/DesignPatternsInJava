package com.palak.designpatterns.structural.decorator;

public class CheeseBurgerDecorator extends BurgerDecorator{
    public CheeseBurgerDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public void makeBurger() {
        burger.makeBurger();
        System.out.println(", chesse added as well.");
    }
}
