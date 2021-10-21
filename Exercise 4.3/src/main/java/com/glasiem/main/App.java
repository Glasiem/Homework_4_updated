package com.glasiem.main;

import com.glasiem.triangles.IsoscelesTriangle;
import com.glasiem.triangles.RightAngledTriangle;
import com.glasiem.triangles.Triangle;

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
                Triangle rt = new RightAngledTriangle(3,4);
                Triangle it = new IsoscelesTriangle(3,60);
                output = "Right-angled:" + "\n";
                output += rt.CalculatePerimeter() + "\n";
                output += rt.CalculateSquare() + "\n";
                output += "Isosceles" + "\n";
                output += it.CalculatePerimeter() + "\n";
                output += it.CalculateSquare() + "\n";
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
