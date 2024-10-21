public class Calculation {
    private double totalCost;
    private double trainingFee;
    private double coachingCost;
    private double competitionFee;

    // Method to calculate the total cost
    public void calculateTotalCost(TrainingPlan trainingPlan, Coaching coachingPlan, Athlete athlete) {
        
        trainingFee = trainingPlan.getWeeklyFee() * 4; // Calculate training fee for 4 weeks

        coachingCost = coachingPlan.getCoachingHours() * 9.00 * 4; // Calculate private coaching cost (coaching hours * $9.00 per hour * 4 weeks)
      
        competitionFee = athlete.getCompetitionsEntered() * 22.00;  // Calculate competition entry fees ($22.00 per competition)

        totalCost = trainingFee + coachingCost + competitionFee; // Calculate the total monthly cost
    }

    // Method to display costs in a formatted way
    public void displayCosts(TrainingPlan trainingPlan, Coaching coachingPlan, Athlete athlete) {
        

        // Display itemized costs
        System.out.println("Itemized Costs:");

        // Training Fee
        System.out.printf("Training Fee (%s, %d sessions per week): $%.2f (4 weeks * $%.2f)\n", 
                          trainingPlan.getPlan(), trainingPlan.getSessionsPerWeek(), trainingFee, trainingPlan.getWeeklyFee());

        // Private Coaching
        if (coachingPlan.getCoachingHours() > 0) {
            System.out.printf("Private Coaching: $%.2f (%d hours/week * $9.00 * 4 weeks)\n", 
                              coachingCost, coachingPlan.getCoachingHours());
        }

        // Competition Entry Fees
        if (athlete.getCompetitionsEntered() > 0) {
            System.out.printf("Competition Entry Fees: $%.2f (%d competition(s) * $22.00)\n", 
                              competitionFee, athlete.getCompetitionsEntered());
        }

        // Total Monthly Cost
        System.out.printf("\nTotal Monthly Cost: $%.2f\n", totalCost);
    }

    public double getTotalCost() {
        return totalCost;
    }
}
