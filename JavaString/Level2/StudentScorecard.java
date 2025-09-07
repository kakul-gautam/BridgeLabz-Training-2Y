package JavaString.Level2;


import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3]; 
        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(41) + 60; 
            scores[i][1] = rand.nextInt(41) + 60; 
            scores[i][2] = rand.nextInt(41) + 60; 
        }
        return scores;
    }
    public static double[][] calculatePerformance(int[][] scores) {
        double[][] performance = new double[scores.length][3]; 
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            performance[i][0] = total;
            performance[i][1] = Math.round(average * 100.0) / 100.0;
            performance[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return performance;
    }
    public static String[] assignGrades(double[][] performance) {
        String[] grades = new String[performance.length];
        for (int i = 0; i < performance.length; i++) {
            double percent = performance[i][2];
            if (percent >= 90) grades[i] = "A+";
            else if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else if (percent >= 50) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }
    public static void displayScorecard(int[][] scores, double[][] performance, String[] grades) {
        System.out.println("\nStudent\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("-------------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" +
                scores[i][0] + "\t" +
                scores[i][1] + "\t\t" +
                scores[i][2] + "\t" +
                (int)performance[i][0] + "\t" +
                performance[i][1] + "\t" +
                performance[i][2] + "%\t\t" +
                grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[][] scores = generateScores(n);
        double[][] performance = calculatePerformance(scores);
        String[] grades = assignGrades(performance);

        displayScorecard(scores, performance, grades);
    }
}
