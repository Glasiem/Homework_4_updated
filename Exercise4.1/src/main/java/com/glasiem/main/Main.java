package com.glasiem.main;

import com.glasiem.triangles.EquilateralTriangle;
import com.glasiem.triangles.Triangle;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Triangle t1 = new Triangle(3,4,5);
        EquilateralTriangle et1 = new EquilateralTriangle(1);
        System.out.println("Triangle");
        System.out.println(t1.calculateAngleA());
        System.out.println(t1.calculateAngleB());
        System.out.println(t1.calculateAngleC());
        System.out.println(t1.calculatePerimeter());
        System.out.println("Equilateral Triangle");
        System.out.println(et1.calculateSquare());
        System.out.println(et1.calculateAngleA());
        System.out.println(et1.calculateAngleB());
        System.out.println(et1.calculateAngleC());
        System.out.println(et1.calculatePerimeter());
        t1.setA(in.nextDouble());
        t1.setB(in.nextDouble());
        t1.setC(in.nextDouble());
        System.out.println("Triangle");
        System.out.println(t1.calculateAngleA());
        System.out.println(t1.calculateAngleB());
        System.out.println(t1.calculateAngleC());
        System.out.println(t1.calculatePerimeter());
    }
}
