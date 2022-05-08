package com.palak.designpatterns.behavioural.memento;

public class LivingAreaOriginator {

    Refrigerator refrigerator;

    public Memento createMemento(){
        return new Memento(refrigerator);
    }

    @Override
    public String toString() {
        return "LivingAreaOriginator{" +
                "refrigerator=" + refrigerator +
                '}';
    }

    public void getMementoToUpdate(Memento m){
        refrigerator = m.getRefrigerator();
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }
}
