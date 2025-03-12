package StrategyDesignPattern;

class EmployeeCustomer extends Customer
{
    public EmployeeCustomer(int customerID, String username, String email, PricingStrategy pricingStrategy)
    {
        //Calling the parent Customer constructor, passing customer information and the pricing strategy.
        super(customerID, username, email, pricingStrategy);
    }

    //Giving loyalty points per purchase
    public int receiveLoyaltyPoints(double totalSpent)
    {
        int receivedLoyalty = (int) (totalSpent * 3); //3 points for every $1 spent

        //Updating stored loyalty point amount
        int currentLoyaltyAmount = super.getLoyaltyPoints();
        int newLoyaltyAmount = currentLoyaltyAmount += receivedLoyalty;
        super.setLoyaltyPoints(newLoyaltyAmount);

        //Returning the loyalty points received from this purchase.
        return receivedLoyalty;
    }
}