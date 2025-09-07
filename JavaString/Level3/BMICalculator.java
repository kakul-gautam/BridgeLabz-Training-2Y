package JavaString.Level3;


import java.util.Scanner;

public class BMICalculator {
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";

        return new String[] {
            String.valueOf(heightCm),
            String.valueOf(weight),
            String.valueOf(bmi),
            status
        };
    }
    public static String[][] processTeam(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            result[i] = calculateBMI(data[i][0], data[i][1]);
        }
        return result;
    }
    public static void displayTable(String[][] bmiData) {
        System.out.println("\nPerson\tHeight(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < bmiData.length; i++) {
            System.out.println((i + 1) + "\t" +
                bmiData[i][0] + "\t\t" +
                bmiData[i][1] + "\t\t" +
                bmiData[i][2] + "\t" +
                bmiData[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] teamData = new double[10][2];

        System.out.println("Enter weight (kg) and height (cm) for 10 team members:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            teamData[i][0] = scanner.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            teamData[i][1] = scanner.nextDouble();
        }

        String[][] bmiResults = processTeam(teamData);
        displayTable(bmiResults);
    }
}
