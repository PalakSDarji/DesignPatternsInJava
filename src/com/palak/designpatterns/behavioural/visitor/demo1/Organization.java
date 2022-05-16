package com.palak.designpatterns.behavioural.visitor.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Organization {
    static List<Employee> employeeList;

    static {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee("Palak"));
        employeeList.add(new Employee("Dhara"));
        employeeList.add(new Employee("Hiya"));
    }

    public static void ratings(){
        CEO ceo = new CEO("John");
        employeeList.forEach(new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {
                employee.accept(ceo);
            }
        });
    }
}
