/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d4;

import java.util.ArrayList;

/**
 *
 * @author Zbrodale
 */
public class AutomobileTestDrive {

    public static void main(String[] args) {

        ArrayList<Automobile> autos = new ArrayList<>();

        Car car1 = new Car("Toyota", "Prius", 2014, "Purple", false, 10);
        autos.add(car1);
        Car car2 = new Car("Chevy", "Volt", 2015, "White", 15);
        autos.add(car2);
        Car car3 = new Car("Nissan", "Leaf", 12);
        autos.add(car3);
        
        Truck truck1 = new Truck("Ford", "F150", 2009, "Silver", 1500, true);
        autos.add(truck1);
        Truck truck2 = new Truck("Chevy", "Big-Block", 1982, "Primer Grey", 4500);
        autos.add(truck2);
        Truck truck3 = new Truck("Dodge", "Ram", 2500);
        autos.add(truck3);

        for (Automobile a : autos) {
            a.accelerate();
            a.accelerate();
            a.accelerate();
            a.brake();
            System.out.print("The " + a.getMake());
            System.out.print(" " + a.getModel() + " is going ");
            System.out.println(a.getSpeed() + " mph.");
        }

    }
}
