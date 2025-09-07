package ControlFlow.level2;

import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (positive integer): ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an Even number");
            } else {
                System.out.println(i + " is an Odd number");
            }
        }
    }
}
