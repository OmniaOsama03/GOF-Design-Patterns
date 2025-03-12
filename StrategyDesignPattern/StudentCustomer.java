package StrategyDesignPattern;

class StudentCustomer extends Customer
{
    public StudentCustomer(int customerID, String username, String email, PricingStrategy pricingStrategy) {
        super(customerID, username, email, pricingStrategy);
    }

    //Giving loyalty points per purchase
    public int receiveLoyaltyPoints(double totalSpent)
    {
        int receivedLoyalty = (int) (totalSpent * 2); // 2 points for every $1 spent

        int currentLoyaltyAmount = super.getLoyaltyPoints();
        int newLoyaltyAmount = currentLoyaltyAmount += receivedLoyalty;
        super.setLoyaltyPoints(newLoyaltyAmount);

        //Returning the loyalty points received from this purchase.
        return receivedLoyalty;
    }
}
