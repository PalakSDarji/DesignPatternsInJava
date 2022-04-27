package com.palak.designpatterns.behavioural.chainOfResponsibility;

public class VP extends LoanApprover{
    @Override
    public void approveLoan(Loan loan) {
        if(loan.getAmount() > 5000 && loan.getAmount() <= 200000){
            System.out.println("Loan of Rs. " + loan.getAmount() + " is approved by VP.");
        }
        else{
            nextLoanApprover.approveLoan(loan);
        }
    }
}
