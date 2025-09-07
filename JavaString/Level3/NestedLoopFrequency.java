package JavaString.Level3;


import java.util.Scanner;

public class NestedLoopFrequency {
    public static String[] findCharacterFrequencies(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            if (chars[i] == '0') continue; 

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; 
                }
            }
        }
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') count++;
        }
        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " = " + freq[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] frequencies = findCharacterFrequencies(input);

        System.out.println("\nCharacter Frequencies:");
        for (String entry : frequencies) {
            System.out.println(entry);
        }
    }
}
