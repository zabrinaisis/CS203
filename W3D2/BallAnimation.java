/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d2;

import java.awt.Graphics;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Zbrodale
 */
public class BallAnimation {

    boolean up;
    boolean down;
    boolean right;
    boolean left;
    private JFrame frame;
    private int x = 0;
    private int y = 0;

    public static void main(String[] args) {
        BallAnimation B = new BallAnimation();
        B.go();
    }

    public void go() {
        frame = new JFrame("Strobe Light Zoo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawPanel d = new DrawPanel();
        frame.getContentPane().add(BorderLayout.CENTER, d);

        frame.addKeyListener(new MyKeyListener());

        frame.setSize(300, 300);
        frame.setVisible(true);

        while (true) {
            if (up && y > 0) {
                y -= 1;
            } else if (down && y < 236) {
                y += 1;
            }
            if (left && x > 0) {
                x -= 1;
            } else if (right && x < 258) {
                x += 1;
            }

            try {
                Thread.sleep(1000 / 60);
                frame.repaint();
            } catch (Exception e) {

            }
        }
    }

    public class DrawPanel extends JPanel {

        @Override
        public void paintComponent(Graphics gr) {
            int r = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);

            Color color = new Color(r, g, b);

            gr.setColor(color);

            gr.fillOval(x, y, 25, 25);
        }
    }

    private class MyKeyListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent ke) {
            // not used
        }

        @Override
        public void keyPressed(KeyEvent ke) {
            if (ke.getKeyCode() == KeyEvent.VK_UP) {
                    up = true;                
            }

            if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
                    down = true;
            }

            if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
                left = true;
            }

            if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
                right = true;
            }
        }

        @Override
        public void keyReleased(KeyEvent ke) {
            if (ke.getKeyCode() == KeyEvent.VK_UP) {
                up = false;
            }

            if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
                down = false;
            }

            if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
                left = false;
            }

            if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
                right = false;
            }
        }
    }
}
