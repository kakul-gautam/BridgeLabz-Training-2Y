package AccessModifiers;
class Employee {
    public int employeeID;           
    protected String department;     
    private double salary;           
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public void setSalary(double newSalary) {
        if (newSalary >= 0) {
            this.salary = newSalary;
        } else {
            System.out.println("Invalid salary amount.");
        }
    }
    public double getSalary() {
        return salary;
    }
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
    }
}
class Manager extends Employee {
    private String teamName;
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }
    public void displayManagerInfo() {
        System.out.println("Manager ID: " + employeeID);      
        System.out.println("Department: " + department);      
        System.out.println("Team Name: " + teamName);
    }
}
public class EmployeeRecords {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1001, "Finance", 55000.0);
        emp1.displayEmployeeInfo();
        emp1.setSalary(60000.0);
        System.out.println("Updated Salary: ₹" + emp1.getSalary());

        System.out.println("\n--- Manager Info ---");
        Manager mgr1 = new Manager(2001, "IT", 75000.0, "TechOps");
        mgr1.displayEmployeeInfo();    
        mgr1.displayManagerInfo();      
    }
}
