
import java.util.Scanner;

public class Competition {
    //private String weightCategory;
    private int competitions;

        // Method to enter the number of competitions this month
    public void enterCompetitions() {
        Scanner scanner = new Scanner(System.in);
        int input = -1;  // Initialize with a value outside the valid range.
    
             // loop for valid input (0-20).
        while (input < 0 || input > 20) {
        System.out.print("Enter the number of competitions this month: ");

        // check if it is a valid number.
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a positive number (0 to 20).");
            scanner.next(); // Consume the invalid input.
        }

    
            input = scanner.nextInt();  // Get the user's input.
    
            // Check if the input is within the valid range.
            if (input < 0 || input > 20) {
                System.out.println("Please enter a number between 0 and 20.");
            }
    
        }
    
        // Store the valid input.
        competitions = input;
    }

    public int getCompetitions() {
        return competitions;
    }
}
