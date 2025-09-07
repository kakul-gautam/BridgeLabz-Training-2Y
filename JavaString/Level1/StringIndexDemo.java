package JavaMethods.Level1;

import java.util.Scanner;

public class StringIndexDemo {
    public static void generateException(String text) {
        System.out.println("Character at index 100: " + text.charAt(100));
    }
    public static void demonstrateExceptionHandling(String text) {
        try {
            System.out.println("Character at index 100: " + text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: Index is out of range.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        demonstrateExceptionHandling(userInput);
    }
}
