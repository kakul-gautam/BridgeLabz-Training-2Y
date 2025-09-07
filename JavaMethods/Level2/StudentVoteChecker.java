package JavaMethods.Level2;

import java.util.Scanner;

public class StudentVoteChecker {
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; 
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of Student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }
        System.out.println("\nVoting Eligibility:");
        for (int i = 0; i < 10; i++) {
            boolean eligible = canStudentVote(studentAges[i]);
            String result = eligible ? "Can Vote" : "Cannot Vote";
            System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") => " + result);
        }
    }
}
