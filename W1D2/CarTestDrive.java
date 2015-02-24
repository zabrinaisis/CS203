/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package w1d2;

/**
 *
 * @author Zbrodale
 */
public class CarTestDrive {
    public static void main (String[] args) {
        
        Car one = new Car();
        Car two = new Car();
        
        one.setX(3);
        one.setY(3);
        
        two.setX(-3);
        two.setY(-3);
        
        one.moveDown();
        one.moveRight();
        one.moveRight();
        one.moveDown();
        
        two.moveUp();
        two.moveLeft();
        two.moveLeft();
        two.moveUp();
        
        System.out.println("Car One");
        one.printLocation();
        System.out.println("Car Two");
        two.printLocation();
    }
}
