package JavaString.Level2;


import java.util.Scanner;

public class WordSplitter {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }

        }
        return count;
    }
    public static String[] manualSplit(String text) {
        int length = findLength(text);
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int[] spaceIndexes = new int[spaceCount + 2]; 
        spaceIndexes[0] = -1; 
        int idx = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }
        spaceIndexes[idx] = length; 
        String[] words = new String[spaceCount + 1];
        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder();
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word.append(text.charAt(j));
            }
            words[i] = word.toString();
        }

        return words;
    }
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] builtInSplit = input.split(" ");
        String[] manualSplit = manualSplit(input);

        boolean isSame = compareArrays(builtInSplit, manualSplit);

        System.out.println("\nBuilt-in split:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nManual split:");
        for (String word : manualSplit) {
            System.out.println(word);
        }

        System.out.println("\nAre both results same? " + isSame);
    }
}
