package com.glasiem.shapes;

public class Diamond extends Shape{
    double a, ha;

    public Diamond(double a, double ha) {
        this.a = a;
        this.ha = ha;
    }

    @Override
    public double calculatePerimeter() {
        return 4*a;
    }

    @Override
    public double calculateSquare() {
        return ha*a;
    }
}
