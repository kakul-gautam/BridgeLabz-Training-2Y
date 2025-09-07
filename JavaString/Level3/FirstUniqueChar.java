package JavaString.Level3;


import java.util.Scanner;

public class FirstUniqueChar {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
          
        }
        return count;
    }
    public static char findFirstUniqueChar(String text) {
        int[] freq = new int[256]; 

        int length = findLength(text);
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        return '\0'; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char result = findFirstUniqueChar(input);

        if (result != '\0') {
            System.out.println("\nFirst non-repeating character: " + result);
        } else {
            System.out.println("\nNo non-repeating character found.");
        }
    }
}
