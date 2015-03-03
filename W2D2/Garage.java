/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package w2d2;
import java.util.ArrayList;

/**
 *
 * @author Zbrodale
 */
public class Garage {
    private Automobile auto;
    private ArrayList<Item> items = new ArrayList<>();
    
    public void store(Automobile auto) {
        this.auto = auto;
    }
    
    public void store(Item i) {
        items.add(i);
    }
    
    public Automobile retrieve() {
        return auto;
    }
    
    public Item retrieve(int index) {
        return items.get(index);
    }
    
    public Automobile getAuto() {
        return auto;
    }

    public void setAuto(Automobile a) {
        this.auto = a;
    }
       
}
