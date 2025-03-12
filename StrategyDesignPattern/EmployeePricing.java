package StrategyDesignPattern;


// This class implements the PricingStrategy interface.
// It represents the pricing strategy for employee customers, applying a 20% discount.
class EmployeePricing implements PricingStrategy
{
    //Implementing the pay method for employee customers
    @Override
    public double pay(double originalPrice) {
        return originalPrice * 0.80;  //20% off
    }
}
