package JavaMethods.Level2;
import java.util.Scanner;

public class UnitConverter3 {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = scanner.nextDouble();
        System.out.printf("%.2f°F = %.2f°C\n", f, convertFahrenheitToCelsius(f));

        System.out.print("Enter temperature in Celsius: ");
        double c = scanner.nextDouble();
        System.out.printf("%.2f°C = %.2f°F\n", c, convertCelsiusToFahrenheit(c));
        System.out.print("Enter weight in pounds: ");
        double pounds = scanner.nextDouble();
        System.out.printf("%.2f lbs = %.2f kg\n", pounds, convertPoundsToKilograms(pounds));

        System.out.print("Enter weight in kilograms: ");
        double kg = scanner.nextDouble();
        System.out.printf("%.2f kg = %.2f lbs\n", kg, convertKilogramsToPounds(kg));
        System.out.print("Enter volume in gallons: ");
        double gallons = scanner.nextDouble();
        System.out.printf("%.2f gallons = %.2f liters\n", gallons, convertGallonsToLiters(gallons));

        System.out.print("Enter volume in liters: ");
        double liters = scanner.nextDouble();
        System.out.printf("%.2f liters = %.2f gallons\n", liters, convertLitersToGallons(liters));
    }
}
