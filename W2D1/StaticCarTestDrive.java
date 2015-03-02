/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package w2d1;

/**
 *
 * @author Zbrodale
 */
public class StaticCarTestDrive {
    public static void main (String[] args) {
        
        StaticCar one = new StaticCar();
        StaticCar two = new StaticCar();
        
        StaticCar.setX(one, 3);
        StaticCar.setY(one, 3);
        
        StaticCar.setX(two, -3);
        StaticCar.setY(two, -3);
        
        StaticCar.setName(one, "Car One");
        StaticCar.setName(two, "Car Two");
        
        StaticCar.moveDown(one, 1);
        StaticCar.moveRight(one, 1);
        StaticCar.moveRight(one, 1);
        StaticCar.moveDown(one, 1);
        
        StaticCar.moveUp(two, 1);
        StaticCar.moveLeft(two, 1);
        StaticCar.moveLeft(two, 1);
        StaticCar.moveUp(two, 1);
        
        StaticCar.setLocation(one, "Car One is at X: " 
                + StaticCar.getX(one) + ", Y: " + StaticCar.getY(one));
        StaticCar.setLocation(two,  "Car Two is at X: " 
                + StaticCar.getX(two) + ", Y: " + StaticCar.getY(two));
        
        System.out.println(StaticCar.getLocation(one));
        System.out.println(StaticCar.getLocation(two));

    } 
}
