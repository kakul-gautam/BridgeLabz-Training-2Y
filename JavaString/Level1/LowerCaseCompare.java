package JavaString.Level1;

import java.util.Scanner;

public class LowerCaseCompare {
    public static String manualToLowerCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char)(ch + 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        String builtInLower = input.toLowerCase(); 
        String manualLower = manualToLowerCase(input); 

        boolean isSame = compareStrings(builtInLower, manualLower);

        System.out.println("Built-in lowercase: " + builtInLower);
        System.out.println("Manual lowercase:   " + manualLower);
        System.out.println("Are both results same? " + isSame);
    }
}
