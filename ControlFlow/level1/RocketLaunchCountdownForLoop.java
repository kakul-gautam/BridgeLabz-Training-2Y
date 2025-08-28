package ControlFlow.level1;
import java.util.Scanner;

public class RocketLaunchCountdownForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: countdown starting value
        System.out.print("Enter countdown start value: ");
        int counter = scanner.nextInt();

        // Countdown using for-loop
        for (int i = counter; i >= 1; i--) {
            System.out.println("Countdown: " + i);
        }

        // Final launch message
        System.out.println("🚀 Launch!");

        scanner.close();
    }
}
