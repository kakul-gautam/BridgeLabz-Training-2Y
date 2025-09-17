package MultilevelInheritance;
class Course {
    protected String courseName;
    protected int duration; 

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}
class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded Sessions: " + (isRecorded ? "Yes" : "No"));
    }
}
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; 

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Course Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: ₹" + calculateFinalFee());
    }

    public double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }
}
public class CourseHierarchyDemo {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse(
            "Data Structures in Java",
            8,
            "Coursera",
            true,
            5000.0,
            20.0
        );

        System.out.println("--- Course Details ---");
        poc.displayInfo();
    }
}
