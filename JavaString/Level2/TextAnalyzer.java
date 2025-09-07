package JavaString.Level2;

import java.util.Scanner;

public class TextAnalyzer {
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
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }
    public static int[] findShortestAndLongest(String[][] wordTable) {
        int minIndex = 0, maxIndex = 0;
        int minLength = Integer.parseInt(wordTable[0][1]);
        int maxLength = minLength;

        for (int i = 1; i < wordTable.length; i++) {
            int length = Integer.parseInt(wordTable[i][1]);
            if (length < minLength) {
                minLength = length;
                minIndex = i;
            }
            if (length > maxLength) {
                maxLength = length;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }
    public static void countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;
        int length = findLength(text);

        for (int i = 0; i < length; i++) {
            char ch = Character.toLowerCase(text.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("\nVowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] words = manualSplit(input);
        String[][] wordTable = getWordsWithLengths(words);
        int[] resultIndexes = findShortestAndLongest(wordTable);

        System.out.println("\nWord\tLength");
        System.out.println("---------------");
        for (String[] row : wordTable) {
            System.out.println(row[0] + "\t" + row[1]);
        }

        System.out.println("\nShortest word: " + wordTable[resultIndexes[0]][0]);
        System.out.println("Longest word:  " + wordTable[resultIndexes[1]][0]);

        countVowelsAndConsonants(input);
    }
}
