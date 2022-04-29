package com.palak.solid.openclosed;

public class OpenClosedDemo {

    public static void main(String[] args) {

        OpenClosedDemo openClosedDemo = new OpenClosedDemo();

        Shape rectangle = new Rectangle();
        openClosedDemo.calculate(rectangle);

        Shape triangle = new Triangle();
        openClosedDemo.calculate(triangle);

        Shape circle = new Circle();
        openClosedDemo.calculate(circle);

    }

    private void calculate(Shape shape){
        shape.calculateArea();
    }
}
