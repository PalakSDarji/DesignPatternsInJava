package com.palak.designpatterns.behavioural.chainOfResponsibility;

public class Manager extends LoanApprover{
    @Override
    public void approveLoan(Loan loan) {
        if(loan.getAmount() > 0 && loan.getAmount() <= 5000){
            System.out.println("Loan of Rs. " + loan.getAmount() + " is approved by Manager.");
        }
        else{
            nextLoanApprover.approveLoan(loan);
        }
    }
}
