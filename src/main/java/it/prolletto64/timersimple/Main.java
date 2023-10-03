package it.prolletto64.timersimple;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Color text = new Color(216, 222, 233);
        Color bg = new Color(48, 54, 65);
        JFrame frame = new JFrame("ORA");
        frame.setAlwaysOnTop(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        JLabel label1 = new JLabel("ORA");
        frame.setLayout(new GridLayout(1, 1));
        label1.setFont(label1.getFont().deriveFont(22.0f));
        frame.add(label1);
        frame.pack();
        frame.setSize(300, frame.getHeight());
        frame.setBackground(bg);
        label1.setOpaque(true);
        label1.setBackground(bg);
        label1.setForeground(text);
        frame.pack();
        frame.repaint();

    }
}
