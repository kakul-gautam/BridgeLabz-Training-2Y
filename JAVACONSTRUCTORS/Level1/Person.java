package Level1;
public class Person {
    private String name;
    private int age;
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
    public static void main(String[] args) {
        Person original = new Person("Kakul", 25);
        System.out.println("Original Person:");
        original.displayInfo();

        System.out.println();
        Person clone = new Person(original);
        System.out.println("Cloned Person:");
        clone.displayInfo();
    }
}
