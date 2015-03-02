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
public class NewGuessGame3P {
    
    NewGuessGamePlayer p1;
    NewGuessGamePlayer p2;
    NewGuessGamePlayer p3;
    
    public void startGame() {
        p1 = new NewGuessGamePlayer();
        p2 = new NewGuessGamePlayer();
        p3 = new NewGuessGamePlayer();
                
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");
        
        while(true) {
         
            p1.guess();
            p2.guess();
            p3.guess();
          
            guessp1 = p1.number;
            guessp2 = p2.number;
            guessp3 = p3.number;
            
            System.out.println("Player one guessed " + guessp1);
            System.out.println("Player two guessed " + guessp2);
            System.out.println("Player three guessed " + guessp3);
          
            System.out.println("Number to guess is " + targetNumber);
          
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
         
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner!!!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);                
                System.out.println("Game is over.");
                break;
            } else {
                System.out.println("Player will have to try again.");
            }
        }
    }
}
