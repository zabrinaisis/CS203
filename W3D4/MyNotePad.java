 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author Zbrodale
 */
public class MyNotePad implements Serializable {

    private JFrame frame = new JFrame("NotePad");
    private JPanel outer = new JPanel();
    private JPanel p1 = new JPanel();
    private JPanel p2 = new JPanel();
    private JPanel p3 = new JPanel();
    private JTextArea text = new JTextArea(31, 48);
    private JButton save = new JButton("Save");
    private JButton load = new JButton("Load");

    public static void main(String[] args) {
        MyNotePad app = new MyNotePad();
        app.go();
    }

    public void go() {

        save.addActionListener(new ClickSave());
        load.addActionListener(new ClickLoad());

        text.setLineWrap(true);
        JScrollPane scroller = new JScrollPane(text);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        p1.add(scroller);

        p2.add(save);
        p2.add(load);

        frame.getContentPane().add(BorderLayout.CENTER, p1);
        frame.getContentPane().add(BorderLayout.SOUTH, p2);

        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class ClickSave implements ActionListener, Serializable {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                FileOutputStream outFileStream = new FileOutputStream("notepad.txt");
                ObjectOutputStream oos = new ObjectOutputStream(outFileStream);
                oos.writeObject(text.getText());
                oos.close();
            } catch (Exception ex) {
                System.out.println("Error");
            }
        }
    }

    private class ClickLoad implements ActionListener, Serializable {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                FileInputStream inFileStream = new FileInputStream("notepad.txt");
                ObjectInputStream ios = new ObjectInputStream(inFileStream);
                String restore = (String) ios.readObject();
                text.setText(restore);
                ios.close();
            } catch (Exception ex) {
                System.out.println("Error");
            }
        }
    }

}
