package JavaMethods.Level3;

import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker3 {
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
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        int digitCount = countDigits(number);
        int[] digits = getDigitsArray(number);
        int[] reversedDigits = reverseArray(digits);
        boolean isPalindrome = isPalindrome(digits);
        boolean isDuck = isDuckNumber(digits);
        System.out.println("\nDigit Count: " + digitCount);
        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.print("\nReversed Digits: ");
        for (int d : reversedDigits) System.out.print(d + " ");
        System.out.println("\nPalindrome Number: " + (isPalindrome ? "Yes" : "No"));
        System.out.println("Duck Number: " + (isDuck ? "Yes" : "No"));
    }
}
