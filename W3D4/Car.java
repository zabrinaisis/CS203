/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d4;

import java.io.Serializable;

/**
 *
 * @author Zbrodale
 */
public class Car implements Serializable {

    private int x;
    private int y;
    private String name;
    public String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int moveUp(int y) {
        this.y = this.y + y;
        return this.y;
    }

    public int moveDown(int y) {
        this.y = this.y - y;
        return this.y;
    }

    public int moveRight(int x) {
        this.x = this.x + x;
        return this.x;
    }

    public int moveLeft(int x) {
        this.x = this.x - x;
        return this.x;
    }

    public String returnLocation() {
        location = getName() + " is at x,y: " + this.x + ", " + this.y + ".";
        return location;
    }

}
