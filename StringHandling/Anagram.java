import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams (different lengths).");
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
