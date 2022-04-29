package com.palak.solid.interfacesegregation;

public class InterfaceSegregationDemo {
    public static void main(String[] args) {

        Human human = new Human();
        human.work();
        human.sleep();

        Robot robot = new Robot();
        robot.work();
    }
}
