package com.palak.designpatterns.behavioural.state;

public class StateDemo {
    public static void main(String[] args) {

        Employee emp1 = new Employee("HR");
        emp1.work();
        emp1.canApproveLeave();

        emp1.setDesignation("Manager");
        emp1.work();
        emp1.canApproveLeave();

        emp1.setDesignation("Developer");
        emp1.work();
        emp1.canApproveLeave();
    }
}
