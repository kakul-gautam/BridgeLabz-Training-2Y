import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] freq = new int[256]; 
        for (char ch : input.toCharArray()) {
            freq[ch]++;
        }

        char mostFrequent = input.charAt(0);
        int maxCount = freq[mostFrequent];

        for (char ch : input.toCharArray()) {
            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                mostFrequent = ch;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}
