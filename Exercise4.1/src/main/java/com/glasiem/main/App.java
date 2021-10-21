package com.glasiem.main;

import com.glasiem.triangles.EquilateralTriangle;
import com.glasiem.triangles.Triangle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class App {
    private JPanel panel1;
    private JButton calculateButton;

    public App(){
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String output;
                Triangle t1 = new Triangle(3,4,5);
                EquilateralTriangle et1 = new EquilateralTriangle(1);
                output = "Triangle" + "\n";
                output += String.valueOf(t1.calculateAngleA()) + "\n";
                output += String.valueOf(t1.calculateAngleB()) + "\n";
                output += String.valueOf(t1.calculateAngleC()) + "\n";
                output += String.valueOf(t1.calculatePerimeter()) + "\n";
                output += "Equilateral Triangle" + "\n";
                output += String.valueOf(et1.calculateSquare()) + "\n";
                output += String.valueOf(et1.calculateAngleA()) + "\n";
                output += String.valueOf(et1.calculateAngleB()) + "\n";
                output += String.valueOf(et1.calculateAngleC()) + "\n";
                output += String.valueOf(et1.calculatePerimeter()) + "\n";
                t1.setA(12);
                t1.setB(13);
                t1.setC(5);
                output += "Triangle" + "\n";
                output += String.valueOf(t1.calculateAngleA()) + "\n";
                output += String.valueOf(t1.calculateAngleB()) + "\n";
                output += String.valueOf(t1.calculateAngleC()) + "\n";
                output += String.valueOf(t1.calculatePerimeter()) + "\n";
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
