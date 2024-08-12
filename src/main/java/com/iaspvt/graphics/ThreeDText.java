package com.iaspvt.graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ThreeDText extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // 3D Text Effect
        Font font = new Font("Serif", Font.BOLD, 100);
        g2d.setFont(font);

        String text = "SAI";
        int x = 50;
        int y = 100;

        // Draw shadow for 3D effect
        g2d.setColor(Color.GRAY);
        g2d.drawString(text, x + 5, y + 5);

        // Draw main text
        g2d.setColor(Color.BLUE);
        g2d.drawString(text, x, y);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("3D Text Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.add(new ThreeDText());
        frame.setVisible(true);
    }
}
