package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean cheeseAdded;
    private boolean toppingsAdded;
    private boolean takeAwayAdded;
    private boolean billGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        this.cheeseAdded=false;
        this.toppingsAdded=false;
        this.takeAwayAdded=false;
        this.billGenerated=false;
        // your code goes here

        if(isVeg)
            this.price+=300;
        else
            this.price+=400;

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(cheeseAdded==false){
            this.price+=80;
            this.cheeseAdded=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppingsAdded){
            if(isVeg)
                this.price += 70;
            else
                this.price += 120;

            toppingsAdded = true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAwayAdded){
            this.price += 20;
            takeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here

        //initializing variables for ouput string
        this.bill = "";
        if(!billGenerated) {
            billGenerated = true;

            int bp = 0, ca = 0, ta = 0, pp = 0;           //bp = base price, ca = cheese added, ta= topping added, pp= parcel price
            if (isVeg)
                bp = 300;
            else
                bp = 400;

            this.bill += "Base Price Of The Pizza: " + bp + "\n";

            if (cheeseAdded) {
                ca = 80;
                this.bill += "Extra Cheese Added: " + ca + "\n";
            }


            if (toppingsAdded) {
                if (isVeg)
                    ta = 70;
                else
                    ta = 120;
                this.bill += "Extra Toppings Added: " + ta + "\n";
            }

            if (takeAwayAdded) {
                pp = 20;
                this.bill += "Paperbag Added: " + pp + "\n";
            }

            this.bill += "Total Price: " + this.price + "\n";

        }

        return this.bill;
    }
}
