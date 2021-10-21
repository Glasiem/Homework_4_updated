package com.glasiem.triangles;

public class RightAngledTriangle extends Triangle{

    public RightAngledTriangle(double a, double b) {
        super(a, b, Math.toRadians(90));
    }

    @Override
    public double CalculateSquare() {
        return 0.5*a*b;
    }

    @Override
    public double CalculatePerimeter() {
        return a+b+Math.sqrt(a*a+b*b);
    }
}
