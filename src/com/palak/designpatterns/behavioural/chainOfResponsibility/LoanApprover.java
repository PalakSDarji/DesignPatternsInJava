package com.palak.designpatterns.behavioural.chainOfResponsibility;

abstract public class LoanApprover {
    protected LoanApprover nextLoanApprover;

    public void setNextLoanApprover(LoanApprover nextLoanApprover) {
        this.nextLoanApprover = nextLoanApprover;
    }

    public abstract void approveLoan(Loan loan);
}
