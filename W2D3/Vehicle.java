/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d3;

/**
 *
 * @author Zbrodale
 */
public abstract class Vehicle {

    private int x;
    private int y;
    private int speed;
    private int direction;

    public void move(int amount) {
        double a = Math.toRadians(amount);
        x = (int) (Math.cos(a) * speed);
        y = (int) (Math.sin(a) * speed);
    }

    public void turn(int amount) {
        if ((direction += amount) > 360) {
            direction = 360;
        } else if ((direction += amount) < 0) {
            direction = 0;
        } else {
            direction += amount;
        }
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public abstract int accelerate();

    public abstract int brake();
}
