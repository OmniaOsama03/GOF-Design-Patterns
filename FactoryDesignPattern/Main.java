package FactoryDesignPattern;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            PizzaStore selectedStore = null;

            //Displaying the available stores
            System.out.println("\n---------- Welcome to the Pizza Order App! ------------");
            System.out.println("Choose your Pizza Store:");
            System.out.println("1. Abu Dhabi Pizza Store");
            System.out.println("2. Dubai Pizza Store");
            System.out.println("3. Sharjah Pizza Store");

            int storeChoice = scanner.nextInt();

            //Selecting the appropriate Pizza Store based on user input
            switch (storeChoice)
            {
                case 1 -> selectedStore = new AbuDhabiPizzaStore();
                case 2 -> selectedStore = new DubaiPizzaStore();
                case 3 -> selectedStore = new SharjahPizzaStore();

                default -> System.out.println("Oh no! Invalid store selection!");
            }

            if (selectedStore != null)
            {
                //Displaying  available pizza types
                System.out.println("----------Choose the type of pizza:");
                System.out.println("- cheese");
                System.out.println("- pepperoni");

                String pizzaType = scanner.next();

                // Order the pizza from the selected store
                Pizza pizza = selectedStore.orderPizza(pizzaType);

                if (pizza != null)
                {
                    System.out.println("\n Enjoy your delicious Pizza! Goodbye! ");
                } else
                {
                    System.out.println("Sorry, we do not have that type of pizza!");
                }
            }else
            {
               System.out.println("Sorry, we do not currently sell pizza from that store!");
            }


        }
    }
}

