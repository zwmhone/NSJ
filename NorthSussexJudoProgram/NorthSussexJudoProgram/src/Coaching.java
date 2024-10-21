import java.util.Scanner;

public class Coaching {
    int coachingHours;

    public void askForCoaching() {
        Scanner scanner = new Scanner(System.in);
        String response;

        // Use a do-while loop to validate the Yes/No response
        do {
            System.out.print("Do you want private coaching? (Yes/No): ");
            response = scanner.nextLine().trim();  // Trim any extra spaces around the input

            if (response.equalsIgnoreCase("Yes")) {
                // If Yes, ask for the coaching hours
                boolean validInput = false;
                do {
                    System.out.print("Enter number of hours (1 to 5): ");
                    // Validate if the input is a number between 1 and 5
                    if (scanner.hasNextInt()) {
                        coachingHours = scanner.nextInt();
                        if (coachingHours >= 1 && coachingHours <= 5) {
                            validInput = true;
                        } else {
                            System.out.println("Invalid input. Please enter a number between 1 and 5.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a valid number.");
                        scanner.next(); // Consume the invalid input
                    }
                } while (!validInput);
                break; // Exit the loop when user enter valid input 
            } else if (response.equalsIgnoreCase("No")) {
                // If No, exit the loop and do nothing
                break;
            } else {
                // If input is not "Yes" or "No", show invalid message and ask again
                System.out.println("Invalid input. Please enter 'Yes' or 'No'.");
            }
        } while (true);  // Continue looping until valid input ("Yes" or "No") 
      
    }

    public int getCoachingHours() {
        return coachingHours;
    }

    public double getCoachingCost() {
        return coachingHours * 9.00;
    }
    
}
