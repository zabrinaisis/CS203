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
public class HamsterTestDrive {
    public static void main(String[] args) {
        
        Hamster[] cage = new Hamster[100];
        
        double num;
        int x = 0;
        while(x < cage.length) {
            cage[x] = new Hamster();
            num = (double) (Math.random() * 3);
            cage[x].age = num;
            x++;
        }
        
        double sum = 0.0d;
        double avg;
        int y = 0;
        while(y < cage.length) {
            sum = sum + cage[y].age;
            y++;
        }
        
        avg = sum/cage.length;
        System.out.println("The average hamster age is: " + avg);
    }
}
