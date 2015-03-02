/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package w2d1;
import java.util.LinkedList;
/**
 *
 * @author Zbrodale
 */
public class AvgLinkedList {
    public static void main(String[] args) {
        
        LinkedList<Integer> ints = new LinkedList<>();
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            int num = (int)(Math.random() * 100);
            ints.add(num);
        }
        
        for (int i = 0; i < ints.size(); i++) {
            sum += ints.get(i);
        }
        
        int avg = sum/100;
        boolean isIn = ints.contains(avg);
        
        System.out.println("The average of the array list is: " + avg);
        System.out.println("The average is in the array: " + isIn);
    }
}
