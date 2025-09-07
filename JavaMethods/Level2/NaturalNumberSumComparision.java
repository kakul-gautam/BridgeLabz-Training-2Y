package JavaMethods.Level2;


import java.util.Scanner;

public class NaturalNumberSumComparision {

    public static int sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }
        int recursiveSum = sumRecursive(n);
        int formulaSum = sumFormula(n);
        System.out.println("\nSum using recursion: " + recursiveSum);
        System.out.println("Sum using formula:   " + formulaSum);
        if (recursiveSum == formulaSum) {
            System.out.println("✅ Both methods give the same result. Computation is correct.");
        } else {
            System.out.println("❌ Results do not match. Please check the logic.");
        }
    }
}
