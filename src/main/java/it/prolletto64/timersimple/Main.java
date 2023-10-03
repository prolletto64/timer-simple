package it.prolletto64.timersimple;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    @SuppressWarnings("BusyWait")
    public static void main(String[] args) {
        Color text = new Color(216, 222, 233);
        Color bg = new Color(48, 54, 65);
        JFrame frame = new JFrame("ORA");
        frame.setAlwaysOnTop(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        JLabel label = new JLabel("ORA");
        frame.setLayout(new GridLayout(1, 1));
        label.setFont(label.getFont().deriveFont(22.0f));
        frame.add(label);
        frame.pack();
        frame.setSize(300, frame.getHeight());
        frame.setBackground(bg);
        label.setOpaque(true);
        label.setBackground(bg);
        label.setForeground(text);
        frame.pack();
        frame.repaint();
        new Thread(() -> {
            LocalDateTime d;
            int s = 99;
            while (true) {
                d = LocalDateTime.now();
                label.setText(d.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
                s = d.getSecond();
                System.gc();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
        }).start();
    }
}
