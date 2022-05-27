package com.palak.designpatterns.structural.decorator.demo1;

abstract public class BurgerDecorator extends PlainBurger{
    protected Burger burger;

    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }

    @Override
    public void makeBurger() {
        burger.makeBurger();
    }
}
