/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d3;

import java.util.ArrayList;

/**
 *
 * @author Zbrodale
 */
public class VehicleTestDriver {

    public static void main(String[] args) {

        ArrayList<Vehicle> v = new ArrayList<>();
        ArrayList<Asset> a = new ArrayList<>();
        ArrayList<Object> o = new ArrayList<>();

        CorporateCar c = new CorporateCar();
        c.purchasePrice = 50000.00;
        c.currentValue = 45000.00;
        c.setYearPurchased(2014);

        v.add(c);
        a.add(c);
        o.add(c);

        c.brake();
        System.out.println("Speed is " + c.getSpeed() + " mph.");
        c.accelerate();
        System.out.println("Speed is " + c.getSpeed() + " mph.");
        c.brake();
        System.out.println("Speed is " + c.getSpeed() + " mph.");
        c.accelerate();
        c.accelerate();
        c.accelerate();
        c.accelerate();
        c.accelerate();
        c.brake();
        System.out.println("Speed is " + c.getSpeed() + " mph.");
        c.brake();
        c.brake();
        c.brake();
        System.out.println("Speed is " + c.getSpeed() + " mph.");

        System.out.print("Purchase price of corporate car was: $");
        System.out.println(c.getPurchasePrice());
        System.out.println(c.toString());
        
        System.out.print("Current value of corporate car is: $");
        System.out.println(c.currentValue);

        c.move(60);
        System.out.println("We are at X: " + c.getX() + ", Y: " + c.getY());
            // roundoff error!

        System.out.println(c.Amortize(20));

    }
}
