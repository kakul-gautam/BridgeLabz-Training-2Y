package JavaString.Level3;


import java.util.Scanner;

public class CharacterFrequency {
    public static int[] calculateFrequency(String text) {
        int[] freq = new int[256]; 

        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            
        }

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        return freq;
    }
    public static String[][] buildFrequencyTable(String text, int[] freq) {
        boolean[] added = new boolean[256];
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {}

        String[][] result = new String[length][2];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (!added[ch]) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                added[ch] = true;
                index++;
            }
        }
        String[][] trimmed = new String[index][2];
        for (int i = 0; i < index; i++) {
            trimmed[i][0] = result[i][0];
            trimmed[i][1] = result[i][1];
        }

        return trimmed;
    }
    public static void displayTable(String[][] table) {
        System.out.println("\nCharacter\tFrequency");
        System.out.println("-------------------------");
        for (String[] row : table) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] freq = calculateFrequency(input);
        String[][] table = buildFrequencyTable(input, freq);
        displayTable(table);
    }
}
