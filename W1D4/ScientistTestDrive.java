/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package other;

/**
 *
 * @author Zbrodale
 */
public class ScientistTestDrive {
    public static void main(String[] args) {
        int i = 5;
        GuineaPigMichael g = new GuineaPigMichael();
        g.setName("Fred");
        
        System.out.println("Before the change.");
        System.out.println("My integer is: " + i);
        System.out.println("My quinea pig is: " + g.getName());
        
        ScientistMichael s = new ScientistMichael();
        i = s.changeThese(i, g);
        
        System.out.println("After the change.");
        System.out.println("My integer is: " + i);
        System.out.println("My quinea pig is: " + g.getName());
        
    }
}
