package Level2;
import java.util.Scanner;

public class PalindromeChecker {
    String text;

    // Constructor to initialize PalindromeChecker object
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if text is palindrome
    boolean isPalindrome() {
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();
        int len = cleanText.length();
        for (int i = 0; i < len / 2; i++) {
            if (cleanText.charAt(i) != cleanText.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // Method to display result
    void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        PalindromeChecker checker = new PalindromeChecker(text);
        checker.displayResult();

        scanner.close();
    }
}
