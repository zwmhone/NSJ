import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            // Create objects of other classes
            Athlete athlete = new Athlete();
            TrainingPlan trainingPlan = new TrainingPlan();
            Weight weight = new Weight();
            WeightComparison compareWeight = new WeightComparison();
            Coaching coachingPlan = new Coaching();
            Calculation calculation = new Calculation();
            Competition competition = new Competition();

            // Ask for athlete name
            athlete.enterName();

            // Display competition rules
            athlete.displayRules();

            // Display training plan and get selection
            trainingPlan.selectPlan();

            // Only if the athlete selects Intermediate or Elite
            if (!trainingPlan.getPlan().equals("Beginner")) {
                // Display competition weight categories and get selection
                weight.selectCompetitionWeight();

                // Get number of competitions entered
                competition.enterCompetitions();
            }

            // Ask for current weight category (all athletes)
            weight.selectCurrentWeight();

            // Ask for private coaching
            coachingPlan.askForCoaching();

            // Calculate the total cost
            calculation.calculateTotalCost(trainingPlan, coachingPlan, athlete);

            // Display results
            athlete.displayResults();
            calculation.displayCosts(trainingPlan, coachingPlan, athlete);

            // If they selected Intermediate or Elite, compare weights
            if (!trainingPlan.getPlan().equals("Beginner")) {
                compareWeight.compare(weight.getCurrentWeight(), weight.getCompetitionWeight());
            }

            // Ask if user wants to enter another athlete
            boolean validResponse = false;
            while (!validResponse) {
                System.out.println("Do you want to enter another athlete? (Yes/No): ");
                String response = scanner.nextLine().trim();

                if (response.equalsIgnoreCase("Yes")) {
                    validResponse = true; // Continue the loop for another athlete
                } else if (response.equalsIgnoreCase("No")) {
                    validResponse = true; // Exit the loop, ending the program
                    continueProgram = false;
                } else {
                    System.out.println("Invalid input. Please enter 'Yes' or 'No'.");
                }
            }
            } 
            System.out.println("Program ended.");
            scanner.close();
        }

    }
