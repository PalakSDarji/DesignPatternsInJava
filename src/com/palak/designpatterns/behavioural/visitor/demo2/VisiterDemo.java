package com.palak.designpatterns.behavioural.visitor.demo2;

import java.util.ArrayList;
import java.util.List;

public class VisiterDemo {
    public static void main(String[] args) {

        List<Visitable> visibleArr = new ArrayList<>();
        visibleArr.add(new Book("Book1",2));
        visibleArr.add(new Fruit("Fruit1",5,10));
        visibleArr.add(new Fruit("Fruit2",3,4));

        System.out.println("Before applying discount : " + visibleArr);

        PriceDiscountVisitor visitor = new PriceDiscountVisitor();
        visibleArr.forEach(visitable -> visitable.accept(visitor));

        System.out.println("After applying discount : " + visibleArr);
    }
}
