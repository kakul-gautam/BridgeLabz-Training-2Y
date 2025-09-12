package Instanceversusclassandvariables;
public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "Tech Academy";
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public void displayCourseDetails() {
        System.out.println("Course Name   : " + courseName);
        System.out.println("Duration      : " + duration + " weeks");
        System.out.println("Fee           : ₹" + fee);
        System.out.println("Institute     : " + instituteName);
    }
    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 8, 4999.00);
        Course c2 = new Course("Data Analysis with Python", 6, 5999.00);

        System.out.println("Course 1 Details:");
        c1.displayCourseDetails();

        System.out.println("\nCourse 2 Details:");
        c2.displayCourseDetails();

        System.out.println("\nUpdating Institute Name...");
        Course.updateInstituteName("CodeVerse Institute");

        System.out.println("\nCourse 1 After Update:");
        c1.displayCourseDetails();

        System.out.println("\nCourse 2 After Update:");
        c2.displayCourseDetails();
    }
}
