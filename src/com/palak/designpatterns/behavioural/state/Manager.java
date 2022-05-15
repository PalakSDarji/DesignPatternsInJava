package com.palak.designpatterns.behavioural.state;

public class Manager implements EmployeeState{
    @Override
    public void work() {
        System.out.println("Manager: handles org needs");
    }

    @Override
    public void canApproveLeave() {
        System.out.println("Manager: can approve developer's leaves");
    }
}
