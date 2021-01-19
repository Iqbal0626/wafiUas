/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendingMechine;

/**
 *
 * @author M WAFIYUL AHDI
 */
public class Drink {

    private String Name;
    private int Price;
    private int Amount = 0;

    public int getAmount() {
        return Amount;
    }

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return Price;
    }

    public Drink(String Name, int Price) {
        this.Name = Name;
        this.Price = Price;

    }

    public void setAmount(int Amount) {
        this.Amount += Amount;
    }

}
