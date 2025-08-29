package Arrays.level1;
import java.util.Scanner;

public class NumberCollector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        System.out.println("Enter up to 10 positive numbers (enter 0 or a negative number to stop):");
        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double input = scanner.nextDouble();

            if (input <= 0) {
                break; 
            }

            if (index == 10) {
                break; 
            }

            numbers[index] = input;
            index++;
        }
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("\nTotal sum of entered numbers: " + total);
        scanner.close();
    }
}
