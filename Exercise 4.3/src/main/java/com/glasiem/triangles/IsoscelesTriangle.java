package com.glasiem.triangles;

public class IsoscelesTriangle extends Triangle {


    public IsoscelesTriangle(double a, double angle) {
        super(a, a, Math.toRadians(angle));
    }

    @Override
    public double CalculateSquare() {
        return 0.5*a*a*Math.sin(angle);
    }

    @Override
    public double CalculatePerimeter() {
        return a+a+2*a*Math.sin(angle);
    }
}
