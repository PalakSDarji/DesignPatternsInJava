package com.palak.designpatterns.behavioural.state;

public class Developer implements EmployeeState{
    @Override
    public void work() {
        System.out.println("Developer: handles code");
    }

    @Override
    public void canApproveLeave() {
        System.out.println("Developer: can approve only leaves of trainee");
    }
}
