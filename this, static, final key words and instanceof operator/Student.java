public class Student {
    static String universityName = "National Institute of Technology";
    private static int totalStudents = 0;

    public final int rollNumber;
    private String name;
    private char grade;
    public Student(int rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;  
    }
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid student object.");
        }
    }
    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + grade);
        } else {
            System.out.println("Cannot update grade. Invalid student object.");
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student(101, "Kakul Sharma", 'A');
        Student s2 = new Student(102, "Ravi Verma", 'B');

        s1.displayStudentDetails();
        System.out.println();
        s2.displayStudentDetails();
        System.out.println();

        s2.updateGrade('A');
        System.out.println();

        Student.displayTotalStudents(); 
    }
}
