package com.glasiem.shapes;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 3.14*2*radius;
    }

    @Override
    public double calculateSquare() {
        return 3.14*radius*radius;
    }
}
