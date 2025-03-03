package movie;
import java.util.Scanner; // Import the Scanner class


public class MovieDriver_Task2 {
	public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner keyboard = new Scanner(System.in);
        String continueInput; // Variable to store user's response for continuing

        do {
            // Create a new Movie object
            movie movie = new movie();

            // Prompt the user to enter the title of a movie
            System.out.print("Enter the title of a movie: ");
            String title = keyboard.nextLine();
            movie.setTitle(title); // Set the title in the movie object

            // Prompt the user to enter the movie's rating
            System.out.print("Enter the movie's rating: ");
            String rating = keyboard.nextLine();
            movie.setRating(rating); // Set the rating in the movie object

            // Prompt the user to enter the number of tickets sold
            System.out.print("Enter the number of tickets sold at the theater: ");
            int soldTickets = keyboard.nextInt();
            movie.setSoldTickets(soldTickets); // Set the number of tickets sold in the movie object

            // Consume the leftover newline character
            keyboard.nextLine();

            // Print out the information using the movie's toString method
            System.out.println(movie.toString());

            // Ask the user if they want to enter another movie
            System.out.print("Do you want to enter another movie? (y or n): ");
            continueInput = keyboard.nextLine();

        } while (continueInput.equalsIgnoreCase("y")); // Continue if the user enters 'y'

        // Close the Scanner object
        keyboard.close();

        System.out.println("Goodbye!");
    }
}
