package ControlFlow.level1;
import java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
            return;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
