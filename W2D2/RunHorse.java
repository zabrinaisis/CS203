/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exam1;

/**
 *
 * @author Zbrodale
 */
public class RunHorse {
    public static void main(String[] args) {
        //String winner;
        boolean result = false;
        //double z = 0.0;
        
        if (args.length < 2) {
            System.out.println("Need at least two names.");
            return; // NOT BREAK! Don't need an else. Or System.exit();
        }
        
        RaceHorseM[] horses = new RaceHorseM[args.length];
        for (int i = 0; i < horses.length; i++) {
                horses[i] = new RaceHorseM();
                horses[i].setName(args[i]);
        }
           
        while (!result) {
            for (int i = 0; i < horses.length; i++) {
                horse[1].run();
            }
            for (RaceHorseM check : horses) {
                if (check.getDistance() > 1000.0) {
                    result = false;                    
                }
            }
        }
        
        RaceHorseM max = horses[0];
        for (int i = 0; i < horses.length; i++) {
            if (horses[i] > max) {
                max = horses[i];
            }
        }
        
        System.out.println("The winning horse is " + max.getName() + "!");
    }
    public class RaceHorseM {
        private String name;
        private double distance;
        
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getDistance() {
            return distance;
        }

        public void setDistance(double distance) {
            this.distance = distance;
        }
    
        public void run() {
            distance += (7 + (Math.random() * 3) + getDistance());
        }
    }
}