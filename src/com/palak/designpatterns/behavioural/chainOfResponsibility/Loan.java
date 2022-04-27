package com.palak.designpatterns.behavioural.chainOfResponsibility;

public class Loan {

    private int amount;

    public Loan(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
