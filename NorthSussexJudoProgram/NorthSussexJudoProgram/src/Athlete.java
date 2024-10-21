import java.util.Scanner;

public class Athlete {
    private String name;
    private int competitionsEntered;

    // method for enter the athlete's name validation
    public void enterName() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter your name:");
            name = scanner.nextLine().trim();  // Use the instance variable 'name' to store the input
           
            // Check for empty input
            if (name.isEmpty()) {
                System.out.println("Please enter a valid name (no empty input or spaces only).");
            }
            // Check for numbers or special characters
            else if (!name.matches("[a-zA-Z ]+")) {
                System.out.println("Please enter a valid name without numbers or special characters.");
            }

        } while (name.isEmpty() || !name.matches("[a-zA-Z ]+"));
        
        System.out.println("Welcome, " + name + "!");
    }
    
    // Getter for name
    public String getName() {
        return name;
    }

    // Method to display competition rules
    public void displayRules() {
        System.out.println("Competition Rules:");
        System.out.println("#Only Intermediate and Elite athletes can enter competitions#");
        System.out.println("#Competitions are held on the second Saturday of each month#");
        System.out.println("#To us this program all you need to do is enter in mutipule choice unless it is a yes or no question#");
    }

    // Getter for competitions entered
    public int getCompetitionsEntered() {
        return competitionsEntered;
    }

    // Method to display results
    public void displayResults() {
        System.out.println();
        System.out.println("Name Of The Athlete: " + name);
        System.out.println("Competitions entered: " + competitionsEntered);
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueEntering = true;

        // Loop to allow entering multiple athletes
        while (continueEntering) {
            Athlete athlete = new Athlete();
            athlete.enterName();
            athlete.displayRules();
            Competition competition = new Competition();
            competition.enterCompetitions();
            athlete.displayResults();

            }
            System.out.println("Thank you for entering all athletes!");
            
        System.out.println("Thank you for entering all athletes!");
    }
     
}
