package ProgrammingElements.Level2;
import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();
        double feetPerYard = 3.0;
        double yardsPerMile = 1760.0;
        double distanceInYards = distanceInFeet / feetPerYard;
        double distanceInMiles = distanceInYards / yardsPerMile;
        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);

        scanner.close();
    }
}
