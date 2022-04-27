package com.palak.designpatterns.behavioural.chainOfResponsibility;

public class Director extends LoanApprover{
    @Override
    public void approveLoan(Loan loan) {
        if(loan.getAmount() > 200000){
            System.out.println("Loan of Rs. " + loan.getAmount() + " is approved by Director.");
        }
    }
}