package movie;
import java.util.Scanner;

public class MovieDriver_Task1 {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner keyboard = new Scanner(System.in);

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

        // Print out the information using the movie's toString method
        System.out.println("Goodbye");

        // Close the Scanner object
        keyboard.close();
    }
}