package HierarchicalInheritance;
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void displayRole() {
        System.out.println("Role: Generic Person");
    }
}
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}
class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}
class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

public class SchoolSystemDemo {
    public static void main(String[] args) {
        Person[] people = {
            new Teacher("Mrs. Sharma", 40, "Mathematics"),
            new Student("Ravi Kumar", 16, "10th Grade"),
            new Staff("Mr. Verma", 35, "Administration")
        };

        for (Person p : people) {
            System.out.println("\n--- Person Details ---");
            p.displayDetails();
            p.displayRole();  
        }
    }
}
