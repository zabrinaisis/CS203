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

public class SmallestNumber {
    public static void main(String[] args) {
          double[] nums = new double[100];
          int x = 0;
          double num;
          while(x < nums.length) {
              num = (double) (Math.random() * 100);
              nums[x] = num;
              x++;
          }
          
          int y = 0;
          double z = 100.0d;
          while(y < nums.length) {
            if(z > nums[y]) {
                z = nums[y];
                y++;
            } else {
                y++;
            }
          }
          System.out.print("The smallest number is: " + z);         
    }
}
