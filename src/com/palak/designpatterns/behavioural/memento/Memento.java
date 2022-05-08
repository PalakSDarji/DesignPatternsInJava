package com.palak.designpatterns.behavioural.memento;

public class Memento {

    Refrigerator refrigerator;

    public Memento(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "refrigerator=" + refrigerator +
                '}';
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }
}
