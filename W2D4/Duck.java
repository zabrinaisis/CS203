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
public class Duck {

    private int weight = 8;
    private String name = "unknown";
    private boolean canFly = true;
    private int airspeed = 22;

    public Duck(int weight, String name, boolean canFly, int airspeed) {
        this.weight = weight;
        this.name = name;
        this.canFly = canFly;
        this.airspeed = airspeed;
    }

    public Duck(int weight, int airspeed) {
        this(weight, "unknown", true, airspeed);
    }

    public Duck() {
    }

    public void quack() {
        System.out.println("Quack Quack!");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public int getAirspeed() {
        return airspeed;
    }

    public void setAirspeed(int airspeed) {
        this.airspeed = airspeed;
    }
}
