/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d4;

/**
 *
 * @author ZBrodale
 */
public class BetterCarTestDrive {
    public static void main (String[] args) {
        
        BetterCar one = new BetterCar();
        BetterCar two = new BetterCar();
        
        one.setX(3);
        one.setY(3);
        
        two.setX(-3);
        two.setY(-3);
        
        one.setName("Car One");
        two.setName("Car Two");
        
        one.moveDown(1);
        one.moveRight(1);
        one.moveRight(1);
        one.moveDown(1);
        
        two.moveUp(1);
        two.moveLeft(1);
        two.moveLeft(1);
        two.moveUp(1);
        
        System.out.println(one.returnLocation());
        System.out.println(two.returnLocation());
    } 
}
