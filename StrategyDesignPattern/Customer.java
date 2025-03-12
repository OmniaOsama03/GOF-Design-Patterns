package StrategyDesignPattern;

import java.util.ArrayList;

//The Customer class holds a reference to a PricingStrategy to calculate the total order price.

public abstract class Customer
{
    //Class-specific attributes:
    private int customerID;
    private String username;
    private String email;
    private int loyaltyPoints;
    
    //Reference to the PricingStrategy (Strategy) that determines the discount logic.
    //This allows the Customer to use different pricing strategies dynamically.
    private PricingStrategy pricingStrategy;
    private ArrayList<Coffee> order = new ArrayList<>();

    //Constructor:
    public Customer(int customerID, String username, String email, PricingStrategy pricingStrategy)
    {
        this.customerID = customerID;
        this.username = username;
        this.email = email;
        this.pricingStrategy = pricingStrategy;
    }

    //Adding a coffee item to the order list
    public void orderItem(Coffee item)
    {
        order.add(item);
        System.out.println("Ordered: " + item.getName() + " ($" + item.getPrice() + ")");
    }

    //Pay method that calculates total price based on the pricing strategy
    public double pay()
    {
        //Calculating price before discount
        double total = 0;

        for (Coffee item : order)
        {
            total += item.getPrice();
        }

        //Delegating the discount setup to the appropriate pricing strategy
        return pricingStrategy.pay(total);
    }

    //An abstract method to give the user loyalty points (Implemented in concrete classes)
    public abstract int receiveLoyaltyPoints(double totalSpent);

    //Necessary setters & getters:
    public int getLoyaltyPoints() {return loyaltyPoints;}
    public String getUsername()
    {
        return username;
    }
    public ArrayList<Coffee> getOrder()
    {
        return this.order;
    }
    public void setLoyaltyPoints(int loyaltyPoints) {this.loyaltyPoints = loyaltyPoints;}
}

