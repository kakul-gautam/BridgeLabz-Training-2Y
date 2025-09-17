package HybridInheritance;
class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
interface Worker {
    void performDuties();
}
class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is preparing " + specialty + " dishes in the kitchen.");
    }
}
class Waiter extends Person implements Worker {
    private int tableCount;

    public Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving " + tableCount + " tables in the dining area.");
    }
}

public class RestaurantSystemDemo {
    public static void main(String[] args) {
        Worker[] staff = {
            new Chef("Rajesh", 101, "Italian"),
            new Waiter("Priya", 102, 6)
        };

        for (Worker w : staff) {
            System.out.println("\n--- Staff Info ---");
            if (w instanceof Person) {
                ((Person) w).displayInfo();
            }
            w.performDuties(); 
        }
    }
}
