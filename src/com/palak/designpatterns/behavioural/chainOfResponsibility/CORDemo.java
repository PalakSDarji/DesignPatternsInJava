package com.palak.designpatterns.behavioural.chainOfResponsibility;

public class CORDemo {
    public static void main(String[] args) {

        Manager manager = new Manager();
        VP vp = new VP();
        Director director = new Director();

        manager.setNextLoanApprover(vp);
        vp.setNextLoanApprover(director);

        Loan loan1 = new Loan(6000);
        manager.approveLoan(loan1);

        Loan loan2 = new Loan(500000);
        manager.approveLoan(loan2);

        Loan loan3 = new Loan(2000);
        manager.approveLoan(loan3);
    }
}
