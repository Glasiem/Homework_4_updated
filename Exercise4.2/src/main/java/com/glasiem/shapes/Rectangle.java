package com.glasiem.shapes;

public class Rectangle extends Shape {
    private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculatePerimeter() {
        return a*2 + b*2;
    }

    @Override
    public double calculateSquare() {
        return a*b;
    }
}
