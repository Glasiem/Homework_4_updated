package com.glasiem.triangles;

public class EquilateralTriangle extends Triangle{

    public EquilateralTriangle(double a) {
        super(a, a, a);
    }

    public double calculateSquare(){
        return (Math.sqrt(3)*a*a) / 4;
    }
}
