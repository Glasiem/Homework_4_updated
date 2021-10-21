package com.glasiem.main;

import com.glasiem.shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(3,4,5,4);
        System.out.println("Triangle");
        System.out.println(triangle.calculatePerimeter());
        System.out.println(triangle.calculateSquare());
        Shape circle = new Circle(4);
        System.out.println("Circle");
        System.out.println(circle.calculatePerimeter());
        System.out.println(circle.calculateSquare());
        Shape rectangle = new Rectangle(2,5);
        System.out.println("Rectangle");
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateSquare());
        Shape square = new Square(5);
        System.out.println("Square");
        System.out.println(square.calculatePerimeter());
        System.out.println(square.calculateSquare());
        Shape diamond = new Diamond(5,2);
        System.out.println("Diamond");
        System.out.println(diamond.calculatePerimeter());
        System.out.println(diamond.calculateSquare());
    }
}
