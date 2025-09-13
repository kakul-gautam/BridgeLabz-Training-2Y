public class Vehicle {
    static double registrationFee = 5000.0;
    public final String registrationNumber;
    private String ownerName;
    private String vehicleType;
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0) {
            registrationFee = newFee;
            System.out.println("Registration fee updated to ₹" + registrationFee);
        } else {
            System.out.println("Invalid fee amount.");
        }
    }
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: ₹" + registrationFee);
        } else {
            System.out.println("Invalid vehicle object.");
        }
    }
    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(5500.0); 

        Vehicle v1 = new Vehicle("UP85AB1234", "Kakul Sharma", "Sedan");
        Vehicle v2 = new Vehicle("DL01CD5678", "Ravi Verma", "Motorbike");

        System.out.println("\n--- Vehicle 1 Details ---");
        v1.displayVehicleDetails();

        System.out.println("\n--- Vehicle 2 Details ---");
        v2.displayVehicleDetails();
    }
}
