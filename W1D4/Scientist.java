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
public class Scientist {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     
    public void changeThese(int subjectA, GuineaPig subjectB) {
        subjectA += 5;
        GuineaPig.setName(subjectB);
        
    }
    
}
