/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package w2d3;

/**
 *
 * @author Zbrodale
 */
public class CorporateCar extends Vehicle implements Asset {
    
    public double purchasePrice;
    public double currentValue;
    private int yearPurchased;
    private String employee;

    @Override
    public int accelerate() {
        if (getSpeed() <= 60) {
            int amount = getSpeed() + 5;
            setSpeed(amount);
            return getSpeed();
        } else {
            setSpeed(65);
            return getSpeed();
        }
    }

    @Override
    public int brake() {
        if (getSpeed() >= 5) {
            int amount = getSpeed() - 5;
            setSpeed(amount);
            return getSpeed();
        } else {
            setSpeed(0);
            return getSpeed();
        }
    }
    
    @Override
    public String toString() {
        return "Or more precisely $" + purchasePrice;
    }

    @Override
    public int getPurchasePrice() {
        return (int) purchasePrice;
    }

    @Override
    public int getCurrentValue() {
        return (int) currentValue;
    }

    public int getYearPurchased() {
        return yearPurchased;
    }

    public void setYearPurchased(int yearPurchased) {
        this.yearPurchased = yearPurchased;
    }

    @Override
    public int Amortize(int years) {
        int yearsSincePurchase = 2015 - getYearPurchased();
        int r = getPurchasePrice() - (getPurchasePrice() / years) * yearsSincePurchase;
        System.out.println("Remaining is: $" + r);
        if (r <= currentValue) {
            int f = getPurchasePrice()/years;
            return f;
        } else {
            int f = (getPurchasePrice()/years) + (int)((r - currentValue)/years);
            return f;
        }
        
    }
    
}
