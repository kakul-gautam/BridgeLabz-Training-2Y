package ControlFlow.level3;
import java.util.*;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("Number of digits: 1");
            return;
        }
        number = Math.abs(number);
        int count = 0;
        while (number != 0) {
            number = number / 10; 
            count++;              
        }
        System.out.println("Number of digits: " + count);
    }
}
