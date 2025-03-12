package FacadeDesignPattern;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Creating the components of the home theater system
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        StreamingPlayer player = new StreamingPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        //Creating the facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, player, projector, lights, screen, popper);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do
        {
            //Displaying the menu
            System.out.println("\n--- Welcome to Omnia & Sara's Home Theater ---");
            System.out.println("1. Watch Movie");
            System.out.println("2. End Movie");
            System.out.println("3. Listen to Radio");
            System.out.println("4. End Radio");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    //Prompting user to enter movie name
                    System.out.print("Enter movie name: ");
                    scanner.nextLine(); //Consuming the new line

                    //Prompting user to enter movie name
                    String movie = scanner.nextLine();
                    homeTheater.watchMovie(movie);
                    break;

                case 2:
                    homeTheater.endMovie();
                    break;

                case 3:
                    //Prompting user to enter radio frequency
                    System.out.print("Enter radio frequency: ");
                    double frequency = scanner.nextDouble();
                    homeTheater.listenToRadio(frequency);
                    break;

                case 4:
                    homeTheater.endRadio();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

