package JavaMethods.Level3;

public class ZaraBonusCalculator {
    public static int[][] generateEmployeeData(int count) {
        int[][] data = new int[count][2]; 
        for (int i = 0; i < count; i++) {
            int salary = 10000 + (int)(Math.random() * 90000); 
            int years = 1 + (int)(Math.random() * 10); 
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] result = new double[employeeData.length][2];
        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;
            result[i][0] = bonus;
            result[i][1] = newSalary;
        }
        return result;
    }
    public static void displaySummary(int[][] employeeData, double[][] bonusData) {
        int totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", "EmpID", "Old Salary", "Years of Service", "Bonus", "New Salary");
        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = bonusData[i][0];
            double newSalary = bonusData[i][1];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%-10d %-15d %-15d %-15.2f %-15.2f\n", i + 1, oldSalary, years, bonus, newSalary);
        }

        System.out.println("\n📊 Summary:");
        System.out.printf("Total Old Salary: ₹%,d\n", totalOldSalary);
        System.out.printf("Total Bonus Paid: ₹%,.2f\n", totalBonus);
        System.out.printf("Total New Salary: ₹%,.2f\n", totalNewSalary);
    }

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10);
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);
        displaySummary(employeeData, bonusData);
    }
}
