package JavaString.Level1;
import java.util.Scanner;

public class CharArrayComparision {
    public static char[] getCharsManually(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        char[] manualChars = getCharsManually(input);
        char[] builtInChars = input.toCharArray();
        boolean areEqual = compareCharArrays(manualChars, builtInChars);
        System.out.println("\nCharacters using manual method:");
        for (char c : manualChars) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nCharacters using toCharArray():");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both arrays equal? " + areEqual);

        scanner.close();
    }
}
