package Costs;

import Model.Wallet;

public class Current_costs {
    private String str;
    private double price;
    private Wallet wallet;
    public Current_costs(){
        this.str="Купить одежду";
        this.price= 79.50;
    }

    public Current_costs(String str, double price) {
        this.str = str;
        this.price = price;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
