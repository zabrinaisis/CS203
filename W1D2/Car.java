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
public class Car {
    
    protected int x;
    protected int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void moveUp() {
        y = y + 1;
    }
    
    public void moveDown() {
        y = y - 1;
    }
    
    public void moveRight() {
        x = x + 1;
    }
    
    public void moveLeft() {
        x = x - 1;
    }
     
    public void printLocation() {
        System.out.println("x position: " + x);
        System.out.println("y position: " + y);
    }
}
