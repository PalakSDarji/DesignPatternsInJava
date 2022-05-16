package com.palak.designpatterns.behavioural.visitor.demo1;

public class CEO implements Visitor{

    String name;

    public CEO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void visit(Visitable vis) {
        Employee e = (Employee) vis;

        e.setPerformanceStatus("Good");

        System.out.println("This is to certify this " + e.getName() +
                " got " + e.getPerformanceStatus());
    }
}
