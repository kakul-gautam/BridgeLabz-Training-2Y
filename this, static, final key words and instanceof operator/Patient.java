public class Patient {
    static String hospitalName = "Sharma Multispeciality Hospital";
    private static int totalPatients = 0;
    public final int patientID;
    private String name;
    private int age;
    private String ailment;
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;  
    }
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Invalid patient object.");
        }
    }
    public static void main(String[] args) {
        Patient p1 = new Patient(1001, "Kakul Sharma", 29, "Migraine");
        Patient p2 = new Patient(1002, "Ravi Verma", 42, "Hypertension");

        System.out.println("\n--- Patient 1 Details ---");
        p1.displayPatientDetails();

        System.out.println("\n--- Patient 2 Details ---");
        p2.displayPatientDetails();

        System.out.println();
        Patient.getTotalPatients(); 
    }
}
