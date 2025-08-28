package ControlFlow.level3;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double second = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        String op = scanner.next();

        System.out.print("Enter a loop count (positive integer): ");
        int number = scanner.nextInt();
        if (number <= 1) {
            System.out.println("Loop count must be greater than 1 to run the for loop.");
            return;
        }
        for (int i = 1; i < number; i++) {
            System.out.println("\nIteration " + i + ":");
            switch (op) {
                case "+":
                    System.out.println("Result: " + (first + second));
                    break;
                case "-":
                    System.out.println("Result: " + (first - second));
                    break;
            }
        }
    }
}
