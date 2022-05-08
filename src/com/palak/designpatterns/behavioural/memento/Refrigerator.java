package com.palak.designpatterns.behavioural.memento;

public class Refrigerator {

    private int price;
    private int volume;
    private boolean isPowerSaver;

    public Refrigerator(int price, int volume, boolean isPowerSaver) {
        super();
        this.price = price;
        this.volume = volume;
        this.isPowerSaver = isPowerSaver;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "price=" + price +
                ", volume=" + volume +
                ", isPowerSaver=" + isPowerSaver +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPowerSaver() {
        return isPowerSaver;
    }

    public void setPowerSaver(boolean powerSaver) {
        isPowerSaver = powerSaver;
    }
}
