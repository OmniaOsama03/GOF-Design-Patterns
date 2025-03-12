package StrategyDesignPattern;

//This class implements the PricingStrategy interface.
//It represents the pricing strategy for student customers, applying a 10% discount.
class StudentPricing implements PricingStrategy
{
    //Implementing the pay method for student customers
    @Override
    public double pay(double originalPrice) {
        return originalPrice * 0.90;  //10% off
    }
}
