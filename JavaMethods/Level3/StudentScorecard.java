package JavaMethods.Level3;

import java.util.Scanner;

public class StudentScorecard {
    public static int[][] generateMarks(int studentCount) {
        int[][] marks = new int[studentCount][3]; 
        for (int i = 0; i < studentCount; i++) {
            marks[i][0] = 40 + (int)(Math.random() * 60); 
            marks[i][1] = 40 + (int)(Math.random() * 60); 
            marks[i][2] = 40 + (int)(Math.random() * 60); 
        }
        return marks;
    }
    public static double[][] calculateResults(int[][] marks) {
        double[][] results = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }
    public static void displayScorecard(int[][] marks, double[][] results) {
        System.out.println("\n📘 Student Scorecard:");
        System.out.println("ID\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%%\n",
                    i + 1,
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int studentCount = scanner.nextInt();
        int[][] marks = generateMarks(studentCount);
        double[][] results = calculateResults(marks);
        displayScorecard(marks, results);
    }
}
