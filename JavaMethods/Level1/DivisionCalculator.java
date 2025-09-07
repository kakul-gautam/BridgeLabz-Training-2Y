package JavaMethods.Level1;

import java.util.Scanner;

public class DivisionCalculator {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dividend (number): ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        
        }
        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println("\nQuotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
    }
}
