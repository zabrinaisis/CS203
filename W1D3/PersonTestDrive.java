/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package w1d3;

/**
 *
 * @author Zbrodale
 */
public class PersonTestDrive {
    public static void main(String[] args) {
        Person[] group = new Person[5];
        
        Person single = new Person();
        single.name = "John Doe";
        
        group[0] = new Person();
        group[0] = single;
        group[1] = new Person();
        group[1] = single; 
        group[2] = new Person();
        group[2] = single;
        group[3] = new Person();
        group[3] = single;
        group[4] = new Person();
        group[4] = single;
        
        System.out.println("Names at so far...");
        System.out.println("Single Person: " + single.name);
        System.out.println("Array Person# 1: " + group[0].name);
        System.out.println("Array Person# 2: " + group[1].name);
        System.out.println("Array Person# 3: " + group[2].name);
        System.out.println("Array Person# 4: " + group[3].name);
        System.out.println("Array Person# 5: " + group[4].name);
        
        single.name = "John Smith";
        
        System.out.println("Names after change...");
        System.out.println("Single Person: " + single.name);
        System.out.println("Array Person# 1: " + group[0].name);
        System.out.println("Array Person# 2: " + group[1].name);
        System.out.println("Array Person# 3: " + group[2].name);
        System.out.println("Array Person# 4: " + group[3].name);
        System.out.println("Array Person# 5: " + group[4].name);
        
    }
}
