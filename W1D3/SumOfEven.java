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
public class SumOfEven {
    public static void main(String[] args) {
        int[] nums = {3, 8, 4, 10, 14, 5, 21};
        int x = 0;
        int sum = 0;
        while(x < nums.length) {
            if(nums[x]%2==0) {
                sum += nums[x];
                x++;
            } else {
                x++;
            }
        }
        System.out.println("The sum is: " + sum);
    }
}
