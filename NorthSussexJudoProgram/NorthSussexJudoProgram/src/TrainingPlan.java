import java.util.Scanner;

public class TrainingPlan {
    String plan;
    private static final String[] PLANS = {"Beginner", "Intermediate", "Elite"};
    private static final double[] WEEKLY_FEES = {25.00, 30.00, 35.00}; // Corresponding fees for A, B, C

    public void selectPlan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose training plan: ");
        System.out.println("A) Beginner (2 sessions per week) - $25.00 per week");
        System.out.println("B) Intermediate (3 sessions per week) - $30.00 per week");
        System.out.println("C) Elite (5 sessions per week) - $35.00 per week");

        plan = getValidInput(3); // Only A to C
    }

    private String getValidInput(int maxOption) {
        Scanner scanner = new Scanner(System.in);
        String input = ""; // Initialize the input variable
        boolean valid = false;

        while (!valid) {
            input = scanner.nextLine().trim().toUpperCase(); //.trim makes it so accd ading space will not make it invlid
            if (input.matches("[A-" + (char)('A' + maxOption - 1) + "]")) {
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter a letter from A to " + (char)('A' + maxOption - 1));
               
            }
        }
        return PLANS[input.charAt(0) - 'A'];
        
    }
    

    public String getPlan() {
        return plan;
    }

    public double getWeeklyFee() {
        return WEEKLY_FEES[plan.equals("Beginner") ? 0 : plan.equals("Intermediate") ? 1 : 2];
    }

    public int getSessionsPerWeek() {
        if (plan.equals("Beginner")) return 2;
        else if (plan.equals("Intermediate")) return 3;
        else return 5;
    }
    
}
