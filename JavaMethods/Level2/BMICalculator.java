package JavaMethods.Level2;

import java.util.Scanner;

public class BMICalculator {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
    }
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal weight";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] teamData = new double[10][3]; 
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            teamData[i][0] = scanner.nextDouble();

            System.out.print("Height (cm): ");
            teamData[i][1] = scanner.nextDouble();
        }
        calculateBMI(teamData);
        String[] bmiStatus = getBMIStatus(teamData);
        System.out.println("\nBMI Report:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                    teamData[i][0], teamData[i][1], teamData[i][2], bmiStatus[i]);
        }
    }
}
