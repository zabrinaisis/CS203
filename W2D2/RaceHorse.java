/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exam1;

/**
 *
 * @author Zbrodale
 */
public class RaceHorse {
    private String name;
    private double distance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    
    public double run() {
        double stride = 7 + (Math.random() * 3) + getDistance();
        setDistance(stride);
        return getDistance();
    }

}
