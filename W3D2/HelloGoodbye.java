/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Zbrodale
 */
public class HelloGoodbye {

    private JButton hello;
    private JButton goodbye;
    private JFrame frame;
    private JLabel label;

    public static void main(String[] args) {
        HelloGoodbye hg = new HelloGoodbye();
        hg.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        hello = new JButton();
        frame.getContentPane().add(BorderLayout.NORTH, hello);
        hello.addActionListener(new HelloListener());

        goodbye = new JButton();
        frame.getContentPane().add(BorderLayout.SOUTH, goodbye);
        goodbye.addActionListener(new GoodbyeListener());

        label = new JLabel("Nothing Yet...");
        frame.getContentPane().add(BorderLayout.CENTER, label);
        
        frame.setVisible(true);
    }

    private class HelloListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            hello.setText("Hello!");
        }

    }

    private class GoodbyeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            goodbye.setText("Goodbye!");
        }

    }
}
