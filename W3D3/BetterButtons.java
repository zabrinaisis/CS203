/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W3D3;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Tyson
 */
public class BetterButtons {

    public static void main(String[] args) {
        BetterButtons bb = new BetterButtons();
        bb.go();
    }

    public void go() {

        JFrame frame = new JFrame();
        JPanel top = new JPanel();
        JPanel bottom = new JPanel();

        JButton buttonA = new JButton(" A ");
        JButton buttonB = new JButton(" B ");
        JButton buttonC = new JButton(" C ");
        JButton buttonD = new JButton(" D ");

        Font bigger = new Font("monospace", Font.BOLD, 100);

        buttonA.setFont(bigger);
        buttonB.setFont(bigger);
        buttonC.setFont(bigger);
        buttonD.setFont(bigger);

        top.add(buttonA);
        top.add(buttonB);
        bottom.add(buttonC);
        bottom.add(buttonD);

        buttonA.addActionListener(new ClickA());
        buttonB.addActionListener(new ClickB());
        buttonC.addActionListener(new ClickC());
        buttonD.addActionListener(new ClickD());

        frame.getContentPane().add(BorderLayout.NORTH, top);
        frame.getContentPane().add(BorderLayout.SOUTH, bottom);
        frame.setSize(375, 350);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class ClickA implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Button A was pressed.");
        }

    }

    private class ClickB implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Button B was pressed.");
        }

    }

    private class ClickC implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Button C was pressed.");
        }

    }

    private class ClickD implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Button D was pressed.");
        }

    }
}
