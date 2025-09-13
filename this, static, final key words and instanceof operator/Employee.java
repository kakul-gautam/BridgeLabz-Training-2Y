public class Employee {
    static String companyName = "TechNova Solutions";
    private static int totalEmployees = 0;
    public final int id;
    private String name;
    private String designation;
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++; 
    }
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Invalid employee object.");
        }
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Kakul Sharma", "Software Engineer");
        Employee emp2 = new Employee(102, "Ravi Verma", "Project Manager");

        emp1.displayEmployeeDetails();
        System.out.println();
        emp2.displayEmployeeDetails();
        System.out.println();

        Employee.displayTotalEmployees(); 
    }
}
