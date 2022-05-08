package com.palak.designpatterns.behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTakerStore {

    List<Memento> refLists = new ArrayList<>();

    public void addMemento(Memento memento){
        refLists.add(memento);
    }

    public Memento getMemento(int index){
        return refLists.get(index);
    }
}
