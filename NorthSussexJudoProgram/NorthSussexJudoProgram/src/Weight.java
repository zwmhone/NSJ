import java.util.Scanner;

public class Weight {
    String competitionWeight;
    String currentWeight;
    private static final String[] WEIGHT_CATEGORIES = {"Heavyweight", "Light-Heavyweight", "Middleweight", "Light-Middleweight", "Lightweight", "Flyweight"};
    
    public void selectCompetitionWeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose competition weight category: ");
        System.out.println("A. Heavyweight (Over 100 kg)");
        System.out.println("B. Light-Heavyweight (90-100 kg)");
        System.out.println("C. Middleweight (81-90 kg)");
        System.out.println("D. Light-Middleweight (73-81 kg)");
        System.out.println("E. Lightweight (66-73 kg)");
        System.out.println("F. Flyweight (60-66 kg)");

        competitionWeight = getValidInput(6); // Only A to F
    }

    public void selectCurrentWeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose  your current weight category: ");
        System.out.println("A. Heavyweight (Over 100 kg)");
        System.out.println("B. Light-Heavyweight (90-100 kg)");
        System.out.println("C. Middleweight (81-90 kg)");
        System.out.println("D. Light-Middleweight (73-81 kg)");
        System.out.println("E. Lightweight (66-73 kg)");
        System.out.println("F. Flyweight (60-66 kg)");

        currentWeight = getValidInput(6); // Only A to F
    }

    private String getValidInput(int maxOption) {
        Scanner scanner = new Scanner(System.in);
        String input = ""; // Initialize the input variable
        boolean valid = false;

        while (!valid) {
            input = scanner.nextLine().trim().toUpperCase();
            if (input.matches("[A-" + (char)('A' + maxOption - 1) + "]")) {
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter a letter from A to " + (char)('A' + maxOption - 1));
            }
        }
        return WEIGHT_CATEGORIES[input.charAt(0) - 'A'];
        
    }

    public String getCompetitionWeight() {
        return competitionWeight;
    }

    public String getCurrentWeight() {
        return currentWeight;
    }
}
