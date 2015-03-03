/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package w2d2;

/**
 *
 * @author Zbrodale
 */
public class GarageTestDriver {
    public static void main(String[] args) {
        
        Garage g = new Garage();
        
        Car c = new Car();
        c.setMake("Toyota");
        c.setModel("Prius");
        Truck t = new Truck();
        t.setMake("Ford");
        t.setModel("F150");
        
        Item wood = new Item();
        wood.setName("wood");
        Item tools = new Item();
        tools.setName("tools");
        Item hose = new Item();
        hose.setName("hose");
        
        g.store(wood);
        g.store(tools);
        g.store(hose);
        g.store(c);
        
        Item thing1 = g.retrieve(0);
        System.out.print("The " + thing1.getName());
        System.out.println(" is in the garage.");
        
        Item thing2 = g.retrieve(1);
        System.out.print("The " + thing2.getName());
        System.out.println(" are in the garage.");
        
        Item thing3 = g.retrieve(2);
        System.out.print("The " + thing3.getName());
        System.out.println(" is in the garage.");
        
        Automobile vehicle = g.retrieve();
        System.out.print("The " + vehicle.getMake() + " ");
        System.out.println(vehicle.getModel() + " is in the garage.");
        
        
    }
}
