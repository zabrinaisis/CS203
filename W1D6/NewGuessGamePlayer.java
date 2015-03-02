/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d6;

/**
 *
 * @author ZBrodale
 */

import java.util.Scanner;

public class NewGuessGamePlayer {
    int number = 0;
    Scanner s = new Scanner(System.in);
    
    public int guess() {
        System.out.print("What is your guess? ");
        number = s.nextInt();
        return number;
    }
}
