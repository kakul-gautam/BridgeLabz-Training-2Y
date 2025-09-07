package JavaMethods.Level3;

import java.util.Scanner;

public class NumberChecker5 {
    public static int sumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static boolean isPerfect(int number) {
        return sumOfProperDivisors(number) == number;
    }
    public static boolean isAbundant(int number) {
        return sumOfProperDivisors(number) > number;
    }
    public static boolean isDeficient(int number) {
        return sumOfProperDivisors(number) < number;
    }
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 2; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }
    public static boolean isStrong(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        System.out.println("\nNumber Analysis:");
        System.out.println("Perfect Number: " + (isPerfect(number) ? "Yes" : "No"));
        System.out.println("Abundant Number: " + (isAbundant(number) ? "Yes" : "No"));
        System.out.println("Deficient Number: " + (isDeficient(number) ? "Yes" : "No"));
        System.out.println("Strong Number: " + (isStrong(number) ? "Yes" : "No"));
    }
}
