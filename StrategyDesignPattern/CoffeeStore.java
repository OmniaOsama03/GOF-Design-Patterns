
package StrategyDesignPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CoffeeStore
{
    public static void main(String[] args)
    {
        //Creating a 2D array of customer IDs and types (1: RegularCustomer, 2: StudentCustomer, 3: EmployeeCustomer)
        int[][] identities =
        {
            {101, 1},
            {102, 2},
            {103, 3}
        };

        //Creating the coffee menu items
        Coffee[] coffeeMenu =
        {
             new Americano(),
             new TurkishCoffee()
        };

        //Creating a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        while (true) //Allowing the ordering process to repeat over and over again
        {
            System.out.println("\nWelcome to the Coffee Shop! Please sign in by entering your customer ID:");
            int inputID = scanner.nextInt();

            //Finding the customer type and creating the appropriate customer object
            Customer token = null;

            for (int[] identity : identities)
            {
                if (identity[0] == inputID)
                {
                    if (identity[1] == 1)
                    {
                        token = new RegularCustomer(inputID, "RegularCustomer01", "userCust@email.com", new RegularPricing());

                    } else if (identity[1] == 2)
                    {
                        token = new StudentCustomer(inputID, "StudentCustomer01", "studentCust@email.com", new StudentPricing());

                    } else if (identity[1] == 3)
                    {
                        token = new EmployeeCustomer(inputID, "EmployeeCustomer01", "employeeCust@email.com", new EmployeePricing());
                    }

                    break;
                }
            }

            if (token == null)
            {
                System.out.println("Invalid ID. Please try again.");
                continue;  //Sending user back to sign-in (no valid user is found)
            }

            System.out.println("Welcome, " + token.getUsername() + "! Let's start your order.");

            //Allowing the customer to order coffee items
            boolean ordering = true;

            while (ordering)
            {
                //Displaying the available menu items
                System.out.println("\nAvailable coffees:");

                for (Coffee coffee : coffeeMenu)
                {
                    System.out.println(coffee.getCoffeeID() + ". " + coffee.getName() + " - $" + coffee.getPrice());
                }

                System.out.println("Please enter the number of the coffee you'd like to order or 0 to finish:");
                int coffeeChoice = scanner.nextInt();

                //Checking if user is still ordering (choice 0 => exit)
                if (coffeeChoice == 0)
                {
                    ordering = false;

                } else
                {
                    //Checking if item ordered a valid
                    boolean validChoice = false;

                    for (Coffee coffee : coffeeMenu)
                    {
                        if (coffee.getCoffeeID() == coffeeChoice)
                        {
                            token.orderItem(coffee);  //Adding the selected coffee to the customer's order
                            validChoice = true;

                            break;
                        }
                    }

                    //Item isn't in menu
                    if (!validChoice)
                    {
                        System.out.println("Invalid coffee choice. Please try again.");
                    }
                }
            }

            //Displaying receipt
            displayReceipt(token, coffeeMenu);

            //Simulating payment
            double total = token.pay();
            System.out.println("Total after discount: $" + total);

            //Displaying loyalty points received
            double loyaltyPointsGiven = token.receiveLoyaltyPoints(total);
            System.out.println("Loyalty points gotten: " + loyaltyPointsGiven);
            System.out.println("You now have " + token.getLoyaltyPoints() + " loyalty points!\n" );

            while(true)
            {
            System.out.print("Please enter payment amount: $");
            double payment = scanner.nextDouble();

            //Checking if payment is enough
            if (payment == total)
            {
                System.out.println("Payment successful! Thank you for your purchase :D");
                break; // Exit the loop if the payment is valid

            } else {
                System.out.println("Payment has failed! The purchase did not go through! :(");
                System.out.println("Please try again.");
            }

        }//Sending user back to sign-in
    }
    }

    //The display receipt method
    public static void displayReceipt(Customer customer, Coffee[] menu)
    {
        System.out.println("\n--- Receipt ---");

        //Displaying the coffee items ordered
        ArrayList<Coffee> order = customer.getOrder();

        if (order.isEmpty())
        {
            System.out.println("No items ordered.");
        } else
        {
            //Using a HashMap to count the quantity of each coffee item
            HashMap<String, Integer> itemCounts = new HashMap<>();
            double totalBeforeDiscount = 0;

            for (Coffee coffee : order)
            {
                //Getting the coffee name and update its count in the map
                String coffeeName = coffee.getName();

                if(itemCounts.containsKey(coffeeName))
                {
                    itemCounts.put(coffeeName, itemCounts.get(coffeeName) + 1);
                }else
                {
                    itemCounts.put(coffeeName, 1);
                }

                //Calculating total before discount
                totalBeforeDiscount += coffee.getPrice();
            }

            //Displaying each item with its count and price
            for (String coffeeName : itemCounts.keySet())
            {
                int quantity = itemCounts.get(coffeeName);
                double price = getCoffeeFromMenu(coffeeName, menu).getPrice();

                System.out.println(coffeeName + " - $" + price + " x " + quantity);
            }


            //Displaying the total before discount
            System.out.println("Total before discount: $" + totalBeforeDiscount);

            //Applying pricing strategy and display the discount
            double totalAfterDiscount = customer.pay();
            double discount = totalBeforeDiscount - totalAfterDiscount;

            System.out.println("Discount applied: -$" + discount);
            System.out.println("Total after discount: $" + totalAfterDiscount);
        }
        System.out.println("--- End of Receipt ---\n");
    }

    //A method to return the coffee object given its name
    public static Coffee getCoffeeFromMenu(String name, Coffee[] menu)
    {
        for (Coffee coffee : menu)
        {
            if (coffee.getName().equalsIgnoreCase(name))
            {
                return coffee;
            }
        }
        return null; //Coffee is not found
    }

}
