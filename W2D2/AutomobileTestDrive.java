/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package w2d2;
import java.util.ArrayList;
/**
 *
 * @author Zbrodale
 */
public class AutomobileTestDrive {
    public static void main(String[] args) {
        
        ArrayList<Automobile> autos = new ArrayList<>();
        
        Car car1 = new Car();
        autos.add(car1);
        car1.setMake("Toyota");
        car1.setModel("Prius");
        
        Car car2 = new Car();
        autos.add(car2);
        car2.setMake("Chevy");
        car2.setModel("Volt");
        
        Truck truck1 = new Truck();
        autos.add(truck1);
        truck1.setMake("Ford");
        truck1.setModel("F150");
        
        Truck truck2 = new Truck();
        autos.add(truck2);
        truck2.setMake("Chevy");
        truck2.setModel("Half-Ton");
        
        Truck truck3 = new Truck();
        autos.add(truck3);
        truck3.setMake("Dodge");
        truck3.setModel("Ram");
        
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
