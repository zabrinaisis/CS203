/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package w2d4;

/**
 *
 * @author Zbrodale
 */
public class StaticCarTestDrive {
    public static void main (String[] args) {
        
        StaticCar one = new StaticCar();
        StaticCar two = new StaticCar(0, 0, "Tesla", "Model X", 2015, "Red");
        StaticCar three = new StaticCar(0, 0, "Tesla", "Model S", "Silver");
        
        StaticCar.setX(one, 3);
        StaticCar.setY(one, 3);
                
        StaticCar.setX(two, -3);
        StaticCar.setY(two, -3);
        
        StaticCar.setX(three, 0);
        StaticCar.setY(three, 0);
        
        StaticCar.setName(one, "Car One");
        StaticCar.setName(two, "Car Two");
        StaticCar.setName(three, "Car Three");
                
        StaticCar.moveDown(one, 1);
        StaticCar.moveRight(one, 1);
        StaticCar.moveRight(one, 1);
        StaticCar.moveDown(one, 1);
        
        StaticCar.moveUp(two, 1);
        StaticCar.moveLeft(two, 1);
        StaticCar.moveLeft(two, 1);
        StaticCar.moveUp(two, 1);
        
        StaticCar.moveUp(three, 1);
        StaticCar.moveRight(three, 1);
        StaticCar.moveDown(three, 1);
        StaticCar.moveLeft(three, 1);
        
        StaticCar.setLocation(one, "Car One is at X: " 
                + StaticCar.getX(one) + ", Y: " + StaticCar.getY(one));
        StaticCar.setLocation(two,  "Car Two is at X: " 
                + StaticCar.getX(two) + ", Y: " + StaticCar.getY(two));
        StaticCar.setLocation(three,  "Car Three is at X: " 
                + StaticCar.getX(three) + ", Y: " + StaticCar.getY(three));
        
        System.out.println(StaticCar.getLocation(one));
        System.out.println(StaticCar.getLocation(two));
        System.out.println(StaticCar.getLocation(three));

    } 
}
