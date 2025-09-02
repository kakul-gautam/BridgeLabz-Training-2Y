package JavaString.Level1;
import java.util.Scanner;

public class SubstringComparision {
    public static String manualSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String original = scanner.next();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();
        String manualSub = manualSubstring(original, start, end);
        String builtInSub = original.substring(start, end);
        boolean areEqual = compareUsingCharAt(manualSub, builtInSub);
        System.out.println("\nManual substring using charAt(): " + manualSub);
        System.out.println("Built-in substring(): " + builtInSub);
        System.out.println("Are both substrings equal? " + areEqual);

        scanner.close();
    }
}
