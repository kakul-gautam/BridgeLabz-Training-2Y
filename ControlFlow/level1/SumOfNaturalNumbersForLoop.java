package ControlFlow.level1;
import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }
        int sumForLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumForLoop += i;
        }
        int sumFormula = n * (n + 1) / 2;
        System.out.println("Sum using for loop: " + sumForLoop);
        System.out.println("Sum using formula: " + sumFormula);
        if (sumForLoop == sumFormula) {
            System.out.println("✅ Both results match. Computation is correct!");
        } else {
            System.out.println("❌ Results do not match. Please check the logic.");
        }
    }
}
