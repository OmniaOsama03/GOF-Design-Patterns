package StrategyDesignPattern;

class RegularPricing implements PricingStrategy
{
    //Implementing the pay method for regular customers
    @Override
    public double pay(double originalPrice) {
        return originalPrice;  //No discount
    }
}
