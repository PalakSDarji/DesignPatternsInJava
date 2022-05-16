package com.palak.designpatterns.behavioural.visitor.demo1;

public class Employee implements Visitable{

    String name;
    String performanceStatus;

    public Employee(String name) {
        this.name = name;
    }

    public String getPerformanceStatus() {
        return performanceStatus;
    }

    public void setPerformanceStatus(String performanceStatus) {
        this.performanceStatus = performanceStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
