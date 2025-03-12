package StrategyDesignPattern;

//This is a concrete class that extends the abstract Customer class.
class RegularCustomer extends Customer
{
    public RegularCustomer(int customerID, String username, String email, PricingStrategy pricingStrategy) {
        // Calls the parent Customer constructor, passing customer information and the pricing strategy.
        super(customerID, username, email, pricingStrategy);
    }

    //Giving loyalty points per purchase
    public int receiveLoyaltyPoints(double totalSpent)
    {
        int receivedLoyalty = (int) totalSpent; //1 point for every $1 spent

        //Updating stored loyalty point amount
        int currentLoyaltyAmount = super.getLoyaltyPoints();
        int newLoyaltyAmount = currentLoyaltyAmount += receivedLoyalty;
        super.setLoyaltyPoints(newLoyaltyAmount);
      
        // Return the loyalty points received from this purchase.
        return receivedLoyalty;
    }

}
