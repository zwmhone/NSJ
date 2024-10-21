public class WeightComparison {
    public void compare(String currentWeight, String competitionWeight) {
        // Example weight values for comparison
        double currentWeightKg = getWeightInKg(currentWeight);
        double competitionWeightLimit = getWeightInKg(competitionWeight);

        System.out.printf("\nWeight Comparison: %.2f kg (current) vs. %.2f kg (category limit)\n", 
                          currentWeightKg, competitionWeightLimit);
        // %.2f kg makes output in .00

        if (currentWeightKg == competitionWeightLimit) {
            System.out.println("The current weight and competition weight matches.");
        } else if (currentWeightKg > competitionWeightLimit) {
            double difference = currentWeightKg - competitionWeightLimit;
            System.out.printf("Exceeds the weight limit by %.2f kg. Athlete needs to lose weight to meet competition requirements.\n", difference);
        } else {
            double difference = competitionWeightLimit - currentWeightKg;
            System.out.printf("Below the weight limit by %.2f kg. Athlete needs to gain weight to meet competition requirements.\n", difference);
        }
    }

    // This method returns the upper weight limit for each category in kilograms
    public double getWeightInKg(String category) {
        if (category.equals("Heavyweight")) {
            return 105.0;  // Example upper weight for Heavyweight
        } else if (category.equals("Light-Heavyweight")) {
            return 100.0;
        } else if (category.equals("Middleweight")) {
            return 90.0;
        } else if (category.equals("Light-Middleweight")) {
            return 81.0;
        } else if (category.equals("Lightweight")) {
            return 73.0;
        } else if (category.equals("Flyweight")) {
            return 66.0;
        } else {
            return 0.0; // Unknown category
        }
    }
}
