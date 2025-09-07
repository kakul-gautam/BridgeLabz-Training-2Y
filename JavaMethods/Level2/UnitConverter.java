package JavaMethods.Level2;

import java.util.Scanner;

public class UnitConverter {
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter kilometers to convert to miles: ");
        double km = scanner.nextDouble();
        System.out.printf("%.2f km = %.2f miles\n", km, convertKmToMiles(km));

        System.out.print("Enter miles to convert to kilometers: ");
        double miles = scanner.nextDouble();
        System.out.printf("%.2f miles = %.2f km\n", miles, convertMilesToKm(miles));

        System.out.print("Enter meters to convert to feet: ");
        double meters = scanner.nextDouble();
        System.out.printf("%.2f meters = %.2f feet\n", meters, convertMetersToFeet(meters));

        System.out.print("Enter feet to convert to meters: ");
        double feet = scanner.nextDouble();
        System.out.printf("%.2f feet = %.2f meters\n", feet, convertFeetToMeters(feet));
    }
}
