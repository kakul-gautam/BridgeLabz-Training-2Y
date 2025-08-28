package ControlFlow.level3;
import java.util.Scanner;

public class LeapYearSingleCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (1582 or later): ");
        int year = scanner.nextInt();
        if (year >= 1582) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        } else {
            System.out.println("Leap year check only applies to years from 1582 onwards.");
        }
    }
}
