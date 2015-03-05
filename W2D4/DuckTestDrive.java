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
public class DuckTestDrive {
    public static void main(String[] args) {
        Duck d1 = new Duck();
        Duck d2 = new Duck();
        d2.setName("Donald");
        
        d1.quack();
        d2.quack();
        
        Duck d3 = new Duck(9, 30);
        d3.quack();
        
        int speed = d2.getAirspeed();
        System.out.println(d2.getName() + "'s speed " + speed);
        
    }
}
