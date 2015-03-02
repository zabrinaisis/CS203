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
public class NewGuessGame1P {
    
    NewGuessGamePlayer p1;
    
    public void startGame() {
        p1 = new NewGuessGamePlayer();

        int guessp1 = 0;
        
        boolean p1isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");
        
        while(true) {
         
            p1.guess();
          
            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);
          
            System.out.println("Number to guess is " + targetNumber);
          
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
         
            if (p1isRight) {
                System.out.println("We have a winner!!!");
                System.out.println("Game is over.");
                break;
            } else {
                System.out.println("Player will have to try again.");
            }
        }
    }
}

