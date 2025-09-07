package JavaMethods.Level3;

import java.util.Scanner;

public class NumberChecker2 {
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
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return sum != 0 && number % sum == 0;
    }
    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int digit : digits) {
            freq[digit]++;
        }

        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;        
            result[i][1] = freq[i];  
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        int digitCount = countDigits(number);
        int[] digits = getDigitsArray(number);
        int sum = sumOfDigits(digits);
        int sumSquares = sumOfSquares(digits);
        boolean isHarshad = isHarshadNumber(number, digits);
        int[][] frequency = digitFrequency(digits);
        System.out.println("\nDigit Count: " + digitCount);
        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println("\nSum of Digits: " + sum);
        System.out.println("Sum of Squares of Digits: " + sumSquares);
        System.out.println("Harshad Number: " + (isHarshad ? "Yes" : "No"));

        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " time(s)");
            }
        }
    }
}
