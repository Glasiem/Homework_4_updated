package com.glasiem.main;

import com.glasiem.shapes.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class App {
    private JButton calculateButton;
    private JPanel panel1;

    public App() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String output;
                Shape triangle = new Triangle(3,4,5,4);
                output = "Triangle" + "\n";
                output += triangle.calculatePerimeter() + "\n";
                output += triangle.calculateSquare() + "\n";
                Shape circle = new Circle(4);
                output += "Circle" + "\n";
                output += circle.calculatePerimeter() + "\n";
                output += circle.calculateSquare() + "\n";
                Shape rectangle = new Rectangle(2,5);
                output += "Rectangle" + "\n";
                output += rectangle.calculatePerimeter() + "\n";
                output += rectangle.calculateSquare() + "\n";
                Shape square = new Square(5);
                output += "Square" + "\n";
                output += square.calculatePerimeter() + "\n";
                output += square.calculateSquare() + "\n";
                Shape diamond = new Diamond(5,2);
                output += "Diamond" + "\n";
                output += diamond.calculatePerimeter() + "\n";
                output += diamond.calculateSquare() + "\n";
                JOptionPane.showMessageDialog(null, output);
            }
        });
    }

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
