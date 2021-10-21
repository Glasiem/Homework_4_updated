package com.glasiem.shapes;

public class Square extends Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calculatePerimeter() {
        return 4*a;
    }

    @Override
    public double calculateSquare() {
        return a*a;
    }
}
