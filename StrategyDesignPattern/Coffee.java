package StrategyDesignPattern;


public class Coffee
{
    //The class-specific attributes:
    private int coffeeID;
    private String name;
    private double price;

    //Constructor:
    public Coffee(int coffeeID, String name, double price)
    {
        this.coffeeID = coffeeID;
        this.name = name;
        this.price = price;
    }

    //Necessary getters:
    public int getCoffeeID() {
        return coffeeID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

