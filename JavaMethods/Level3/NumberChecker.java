package JavaMethods.Level3;

import java.util.Scanner;

public class NumberChecker {
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }
    public static int[] findTwoLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }
    public static int[] findTwoSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        int digitCount = countDigits(number);
        int[] digits = getDigitsArray(number);
        boolean isDuck = isDuckNumber(digits);
        boolean isArmstrong = isArmstrongNumber(number, digits);
        int[] largestTwo = findTwoLargest(digits);
        int[] smallestTwo = findTwoSmallest(digits);
        System.out.println("\nDigit Count: " + digitCount);
        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println("\nDuck Number: " + (isDuck ? "Yes" : "No"));
        System.out.println("Armstrong Number: " + (isArmstrong ? "Yes" : "No"));
        System.out.println("Largest Digit: " + largestTwo[0]);
        System.out.println("Second Largest Digit: " + largestTwo[1]);
        System.out.println("Smallest Digit: " + smallestTwo[0]);
        System.out.println("Second Smallest Digit: " + smallestTwo[1]);
    }
}
