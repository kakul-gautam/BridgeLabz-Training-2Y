interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}
abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;
    private StringBuilder medicalHistory = new StringBuilder();
    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }
    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    protected String getMaskedDiagnosis() {
        return diagnosis == null ? "N/A" : "****" + diagnosis.substring(Math.max(0, diagnosis.length() - 4));
    }

    protected void addToHistory(String entry) {
        medicalHistory.append(entry).append("\n");
    }

    protected String getMedicalHistory() {
        return medicalHistory.length() == 0 ? "No records available." : medicalHistory.toString();
    }
    public abstract double calculateBill();
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: " + getMaskedDiagnosis());
        System.out.println("Medical History:\n" + getMedicalHistory());
        System.out.println("Total Bill: ₹" + calculateBill());
    }
}
class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;

    public InPatient(String patientId, String name, int age, String diagnosis, int daysAdmitted, double dailyRate) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate + 500; 
    }

    @Override
    public void addRecord(String record) {
        addToHistory("InPatient Record: " + record);
    }

    @Override
    public String viewRecords() {
        return getMedicalHistory();
    }
}
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        addToHistory("OutPatient Record: " + record);
    }

    @Override
    public String viewRecords() {
        return getMedicalHistory();
    }
}
public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient("P001", "Kakul Sharma", 34, "Pneumonia", 5, 2000),
            new OutPatient("P002", "Rajiv Mehta", 45, "Migraine", 800)
        };
        ((MedicalRecord) patients[0]).addRecord("Admitted to ICU for 3 days");
        ((MedicalRecord) patients[1]).addRecord("Prescribed painkillers and rest");
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("---------------------------");
        }
    }
}
