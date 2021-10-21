package com.glasiem.main;

import com.glasiem.triangles.IsoscelesTriangle;
import com.glasiem.triangles.RightAngledTriangle;
import com.glasiem.triangles.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle rt = new RightAngledTriangle(3,4);
        Triangle it = new IsoscelesTriangle(3,60);
        System.out.println("Right-angled:");
        rt.CalculatePerimeter();
        rt.CalculateSquare();
        System.out.println("Isosceles");
        it.CalculatePerimeter();
        it.CalculateSquare();
    }
}
