package com.palak.designpatterns.structural.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {

        Burger burger = new PlainBurger();
        burger.makeBurger();

        CheeseBurgerDecorator cheeseBurgerDecorator = new CheeseBurgerDecorator(burger);
        cheeseBurgerDecorator.makeBurger();

        BarbecueBurgerDecorator barbecueBurgerDecorator = new BarbecueBurgerDecorator(burger);
        barbecueBurgerDecorator.makeBurger();
    }
}
