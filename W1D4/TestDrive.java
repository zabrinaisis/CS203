/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d4;

/**
 *
 * @author ZBrodale
 */
public class TestDrive {
    public static void main(String[] args) {
        
        Scientist evil = new Scientist();
        GuineaPig innocent = new GuineaPig();
        
        innocent.setName("Bob");
        int x = 2;
        
        System.out.print("Int: ");
        System.out.println(x);
        System.out.print("Name: ");
        System.out.println(innocent.getName());
        
        evil.changeThese(x, innocent);
        
        System.out.print("Int: ");
        System.out.println(x);
        System.out.print("Name: ");
        System.out.println(innocent.getName());
    }
}
