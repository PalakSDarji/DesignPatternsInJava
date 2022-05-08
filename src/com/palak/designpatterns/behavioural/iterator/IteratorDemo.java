package com.palak.designpatterns.behavioural.iterator;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("Tom");
        list.add("Jerry");
        list.add("Poppoye");
        list.add("Palak");

        Iterator<String> iterator = list.iterator();
        System.out.println("Iterator: " + iterator.toString());
        while(iterator.hasNext()){
            String value = iterator.next();
            System.out.println("Value: " + value);
        }

        Set<String> set = new HashSet<>();
        set.add("Tom");
        set.add("Jerry");
        set.add("Poppoye");
        set.add("Palak");

        Iterator<String> iteratorSet = set.iterator();
        System.out.println("IteratorSet: " + iteratorSet.toString());
        while(iteratorSet.hasNext()){
            String value = iteratorSet.next();
            System.out.println("Value: " + value);
        }

    }
}
