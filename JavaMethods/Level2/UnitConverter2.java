package JavaMethods.Level2;

import java.util.Scanner;

public class UnitConverter2 {
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3.0;
        return yards * yards2feet;
    }
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter yards to convert to feet: ");
        double yards = scanner.nextDouble();
        System.out.printf("%.2f yards = %.2f feet\n", yards, convertYardsToFeet(yards));

        System.out.print("Enter feet to convert to yards: ");
        double feet = scanner.nextDouble();
        System.out.printf("%.2f feet = %.2f yards\n", feet, convertFeetToYards(feet));

        System.out.print("Enter meters to convert to inches: ");
        double meters = scanner.nextDouble();
        System.out.printf("%.2f meters = %.2f inches\n", meters, convertMetersToInches(meters));

        System.out.print("Enter inches to convert to meters: ");
        double inches = scanner.nextDouble();
        System.out.printf("%.2f inches = %.4f meters\n", inches, convertInchesToMeters(inches));

        System.out.print("Enter inches to convert to centimeters: ");
        double inchesCm = scanner.nextDouble();
        System.out.printf("%.2f inches = %.2f centimeters\n", inchesCm, convertInchesToCentimeters(inchesCm));
    }
}
