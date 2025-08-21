import java.util.Scanner;

public class triangle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of the triangle (in inches): ");
        double base = input.nextDouble();

        System.out.print("Enter height of the triangle (in inches): ");
        double heightInInches = input.nextDouble();
        double areaInInches = 0.5 * base * heightInInches;
        double inchToCm = 2.54;
        double heightInCm = heightInInches * inchToCm;
        double heightInFeet = heightInInches / 12;

        double areaInCm = areaInInches * (inchToCm * inchToCm); // Convert square inches to square cm

        System.out.println("\nYour height in cm is " + heightInCm +
                           " while in feet is " + heightInFeet +
                           " and inches is " + heightInInches);

        System.out.println("Area of the triangle is " + areaInInches + " square inches and " +
                           areaInCm + " square centimeters.");
    }
}
