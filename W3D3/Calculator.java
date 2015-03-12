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
import javax.swing.JTextField;

/**
 *
 * @author Tyson
 */
public class Calculator {

    JFrame frame = new JFrame();
    JPanel A = new JPanel();
    JPanel B = new JPanel();
    JPanel C = new JPanel();
    JPanel D = new JPanel();
    JPanel E = new JPanel();
    JPanel Z = new JPanel();

    JTextField field = new JTextField(5);
    JButton clear = new JButton(" C ");
    JButton seven = new JButton(" 7 ");
    JButton eight = new JButton(" 8 ");
    JButton nine = new JButton(" 9 ");
    JButton plus = new JButton(" + ");
    JButton four = new JButton(" 4 ");
    JButton five = new JButton(" 5 ");
    JButton six = new JButton(" 6 ");
    JButton minus = new JButton(" - ");
    JButton one = new JButton(" 1 ");
    JButton two = new JButton(" 2 ");
    JButton three = new JButton(" 3 ");
    JButton mult = new JButton(" * ");
    JButton decimal = new JButton(" . ");
    JButton zero = new JButton(" 0 ");
    JButton equal = new JButton(" = ");
    JButton divide = new JButton(" / ");

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.go();
    }

    public void go() {

        Font bigger = new Font("monospace", Font.BOLD, 50);

        field.setFont(bigger);
        clear.setFont(bigger);
        seven.setFont(bigger);
        eight.setFont(bigger);
        nine.setFont(bigger);
        plus.setFont(bigger);
        four.setFont(bigger);
        five.setFont(bigger);
        six.setFont(bigger);
        minus.setFont(bigger);
        one.setFont(bigger);
        two.setFont(bigger);
        three.setFont(bigger);
        mult.setFont(bigger);
        decimal.setFont(bigger);
        zero.setFont(bigger);
        equal.setFont(bigger);
        divide.setFont(bigger);

        A.add(field);
        A.add(clear);
        B.add(seven);
        B.add(eight);
        B.add(nine);
        B.add(plus);
        C.add(four);
        C.add(five);
        C.add(six);
        C.add(minus);
        D.add(one);
        D.add(two);
        D.add(three);
        D.add(mult);
        E.add(decimal);
        E.add(zero);
        E.add(equal);
        E.add(divide);
        
        clear.addActionListener(new ClickyC());
        seven.addActionListener(new Clicky7());
        eight.addActionListener(new Clicky8());
        nine.addActionListener(new Clicky9());
        plus.addActionListener(new ClickyPlus());
        four.addActionListener(new Clicky4());
        five.addActionListener(new Clicky5());
        six.addActionListener(new Clicky6());
        minus.addActionListener(new ClickyMinus());
        one.addActionListener(new Clicky1());
        two.addActionListener(new Clicky2());
        three.addActionListener(new Clicky3());
        mult.addActionListener(new ClickyMult());
        decimal.addActionListener(new ClickyDec());
        zero.addActionListener(new Clicky0());
        equal.addActionListener(new ClickyEqual());
        divide.addActionListener(new ClickyDiv());


        Z.add(BorderLayout.CENTER, A);
        Z.add(BorderLayout.CENTER, B);
        Z.add(BorderLayout.CENTER, C);
        Z.add(BorderLayout.CENTER, D);
        Z.add(BorderLayout.CENTER, E);
        Z.setLayout(new BoxLayout(Z, BoxLayout.Y_AXIS));

        frame.getContentPane().add(BorderLayout.CENTER, Z);
        frame.setSize(450, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class ClickyC implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            field.setText("");
        }

    }
    
    private class Clicky7 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            field.setText("7");
        }

    }
    
    private class Clicky8 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            field.setText("8");
        }

    }
    
    private class Clicky9 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            field.setText("9");
        }

    }
    
    private class ClickyPlus implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            field.setText("+");
        }

    }
    
    private class Clicky4 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            field.setText("4");
        }

    }
    
    private class Clicky5 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            field.setText("5");
        }

    }
    
    private class Clicky6 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            field.setText("6");
        }

    }
    
    private class ClickyMinus implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            field.setText("-");
        }

    }
    
    private class Clicky1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            field.setText("1");
        }

    }
    
    private class Clicky2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            field.setText("7");
        }

    }
    
    private class Clicky3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            field.setText("3");
        }

    }
    
    private class ClickyMult implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            field.setText("*");
        }

    }
    
    private class ClickyDec implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            field.setText(".");
        }

    }
    
    private class Clicky0 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            field.setText("0");
        }

    }
    
    private class ClickyEqual implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            field.setText("=");
        }

    }
    
    private class ClickyDiv implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            field.setText("/");
        }

    }
}
