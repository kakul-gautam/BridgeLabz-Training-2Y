import java.util.Scanner;

public class distance{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in feet: ");
        double distanceInFeet = input.nextDouble();
        double feetToInches = 12.0;
        double feetToCm = 30.48;
        double feetToYards = 1.0 / 3.0;
        double feetToMiles = 1.0 / (1760 * 3); // since 1 mile = 1760 yards and 1 yard = 3 feet
        double distanceInInches = distanceInFeet * feetToInches;
        double distanceInCm = distanceInFeet * feetToCm;
        double distanceInYards = distanceInFeet * feetToYards;
        double distanceInMiles = distanceInFeet * feetToMiles;
        System.out.println("\nYour height in cm is " + distanceInCm +
                           ", in feet is " + distanceInFeet +
                           ", and in inches is " + distanceInInches);

        System.out.println("That equals " + distanceInYards + " yards and " +
                           distanceInMiles + " miles.");
    }
}
