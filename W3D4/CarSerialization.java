/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.*;

/**
 *
 * @author Zbrodale
 */
public class CarSerialization {
    public static void main (String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        Car one = new Car();
        Car two = new Car();
        Car three = new Car();
        
        one.setX(3);
        one.setY(3);
        
        two.setX(-3);
        two.setY(-3);
        
        three.setX(0);
        three.setY(0);
        
        one.setName("Car One");
        two.setName("Car Two");
        three.setName("Car Three");
        
        one.moveDown(1);
        one.moveRight(1);
        one.moveRight(1);
        one.moveDown(1);
        
        two.moveUp(1);
        two.moveLeft(1);
        two.moveLeft(1);
        two.moveUp(1);
        
        three.moveUp(1);
        three.moveRight(1);
        three.moveDown(1);
        three.moveLeft(1);
        
        System.out.println(one.returnLocation());
        System.out.println(two.returnLocation());
        System.out.println(three.returnLocation());
        
        FileOutputStream outFileStream = new FileOutputStream("cars.ser");
        ObjectOutputStream oos = new ObjectOutputStream(outFileStream);
        
        oos.writeObject(one);
        oos.writeObject(two);
        oos.writeObject(three);
        oos.close();
        
        FileInputStream inFileStream = new FileInputStream("cars.ser");
        ObjectInputStream ios = new ObjectInputStream(inFileStream);
        
        Car oneRestore = (Car) ios.readObject();
        Car twoRestore = (Car) ios.readObject();
        Car threeRestore = (Car) ios.readObject();
        ios.close();
        
        System.out.println("One's name: " + oneRestore.getName());
        System.out.println("Two's name: " + twoRestore.getName());
        System.out.println("Three's name: " + threeRestore.getName());
        
        
    } 
}
