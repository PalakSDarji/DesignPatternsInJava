package com.palak.designpatterns.behavioural.state;

public class HR implements EmployeeState{
    @Override
    public void work() {
        System.out.println("HR: handles employee welfare");
    }

    @Override
    public void canApproveLeave() {
        System.out.println("HR: can't approve any leaves");
    }
}
