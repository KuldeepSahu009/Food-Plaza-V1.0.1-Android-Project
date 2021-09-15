package com.rafale.studio.V1.foodplaza.Domains;

import java.io.Serializable;

public class FoodDomains implements Serializable {
    private String title;
    private String pic;
    private String description;
    private double fee;
    private int numInCart;

    //Constructor(First 4)
    public FoodDomains(String title, String pic, String description, double fee) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.fee = fee;
    }

    // Constructor (All)
    public FoodDomains(String title, String pic, String description, double fee, int numInCart) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.fee = fee;
        this.numInCart = numInCart;
    }

    // Getter and Setter (ALL)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getNumInCart() {
        return numInCart;
    }

    public void setNumInCart(int numInCart) {
        this.numInCart = numInCart;
    }

}// END
