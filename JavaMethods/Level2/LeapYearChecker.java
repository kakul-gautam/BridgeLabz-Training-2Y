package JavaMethods.Level2;

import java.util.Scanner;

public class LeapYearChecker {

    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            System.out.println("Leap year check is valid only for year >= 1582 (Gregorian calendar).");
            return false;
        }

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is Not a Leap Year.");
        }
    }
}
