package com.palak.designpatterns.behavioural.state;

public class Employee {

    private String designation;
    private EmployeeState employeeState;

    public Employee(String designation) {
        this.designation = designation;
        setDesignation(designation);
    }

    public void work(){
        employeeState.work();
    }

    public void canApproveLeave(){
        employeeState.canApproveLeave();
    }

    public void setDesignation(String des){
        this.designation = des;
        if(designation.equals("HR")){
            employeeState = new HR();
        }
        else if(designation.equals("Developer")){
            employeeState = new Developer();
        }
        else if(designation.equals("Manager")){
            employeeState = new Manager();
        }
        else {
            employeeState = new Developer();
        }
    }
}
