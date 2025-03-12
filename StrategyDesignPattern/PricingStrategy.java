package StrategyDesignPattern;

//This is the "Strategy" in the Strategy Pattern, allowing multiple pricing strategies to implement it.
public interface PricingStrategy
{
    //Pay method to be implemented in concrete classes
    double pay(double originalPrice);
}
