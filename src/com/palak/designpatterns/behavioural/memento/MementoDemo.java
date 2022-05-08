package com.palak.designpatterns.behavioural.memento;

import java.rmi.registry.Registry;

public class MementoDemo {
    public static void main(String[] args) {

        LivingAreaOriginator livingAreaOriginator = new LivingAreaOriginator();
        CareTakerStore careTakerStore = new CareTakerStore();

        livingAreaOriginator.setRefrigerator(new Refrigerator(15000,15,false));
        careTakerStore.addMemento(livingAreaOriginator.createMemento());

        livingAreaOriginator.setRefrigerator(new Refrigerator(25000,25,true));
        careTakerStore.addMemento(livingAreaOriginator.createMemento());

        System.out.println("Current state of living area : " + livingAreaOriginator);

        //restore the old one.
        System.out.println("Restoring the old one.");

        livingAreaOriginator.getMementoToUpdate(careTakerStore.getMemento(0));

        System.out.println("Current state of living area after restoring: " + livingAreaOriginator);
    }
}
