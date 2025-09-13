package AccessModifiers;
class Student {
    public int rollNumber;           
    protected String name;           
    private double CGPA;             
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public double getCGPA() {
        return CGPA;
    }
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Must be between 0.0 and 10.0.");
        }
    }
    public void displayInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}
class PostgraduateStudent extends Student {

    private String thesisTitle;
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTitle) {
        super(rollNumber, name, CGPA);
        this.thesisTitle = thesisTitle;
    }
    public void displayPostgradInfo() {
        System.out.println("Postgraduate Student: " + name); 
        System.out.println("Thesis Title: " + thesisTitle);
    }
}
public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Amit", 8.5);
        s1.displayInfo();
        s1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        System.out.println("\n--- Postgraduate Student Info ---");
        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Neha", 9.2, "AI in Education");
        pg1.displayInfo();
        pg1.displayPostgradInfo();
    }
}
