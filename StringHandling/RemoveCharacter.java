import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char toRemove = scanner.next().charAt(0);

        String result = "";
        for (char ch : input.toCharArray()) {
            if (ch != toRemove) {
                result += ch;
            }
        }

        System.out.println("Modified String: " + result);
    }
}
