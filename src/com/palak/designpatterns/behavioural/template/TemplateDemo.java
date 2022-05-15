package com.palak.designpatterns.behavioural.template;

public class TemplateDemo {
    public static void main(String[] args) {

        ProcessOrder processOrderFlipkart = new Flipkart();
        processOrderFlipkart.doShopping();

        ProcessOrder processOrderShop = new Shop();
        processOrderShop.doShopping();
    }
}
