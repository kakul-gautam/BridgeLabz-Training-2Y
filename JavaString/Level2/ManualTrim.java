package JavaString.Level2;


import java.util.Scanner;

public class ManualTrim {
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = 0;
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                start = i;
                break;
            }
        }
        for (int i = length - 1; i >= 0; i--) {
            if (text.charAt(i) != ' ') {
                end = i;
                break;
            }
        }

        return new int[]{start, end + 1}; 
    }
    public static String manualSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }
    public static boolean compareStrings(String a, String b) {
        int lenA = 0, lenB = 0;
        try {
            while (true) a.charAt(lenA++);
        } catch (StringIndexOutOfBoundsException e) {}
        try {
            while (true) b.charAt(lenB++);
        } catch (StringIndexOutOfBoundsException e) {}

        if (lenA != lenB) return false;

        for (int i = 0; i < lenA; i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with leading/trailing spaces: ");
        String input = scanner.nextLine();

        int[] indexes = findTrimIndexes(input);
        String manualTrimmed = manualSubstring(input, indexes[0], indexes[1]);
        String builtInTrimmed = input.trim();

        boolean isSame = compareStrings(manualTrimmed, builtInTrimmed);

        System.out.println("\nManual Trimmed:   '" + manualTrimmed + "'");
        System.out.println("Built-in Trimmed: '" + builtInTrimmed + "'");
        System.out.println("Are both equal?   " + isSame);
    }
}
