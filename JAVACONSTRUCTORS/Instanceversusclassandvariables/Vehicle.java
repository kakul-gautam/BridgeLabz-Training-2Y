package Instanceversusclassandvariables;
public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 5000.00;
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    public void displayVehicleDetails() {
        System.out.println("Owner Name     : " + ownerName);
        System.out.println("Vehicle Type   : " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to ₹" + registrationFee);
    }
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Kakul", "Sedan");
        Vehicle v2 = new Vehicle("Ravi", "Motorbike");

        System.out.println("Vehicle 1 Details:");
        v1.displayVehicleDetails();

        System.out.println("\nVehicle 2 Details:");
        v2.displayVehicleDetails();

        System.out.println("\nUpdating Registration Fee...");
        Vehicle.updateRegistrationFee(6500.00);

        System.out.println("\nVehicle 1 After Update:");
        v1.displayVehicleDetails();

        System.out.println("\nVehicle 2 After Update:");
        v2.displayVehicleDetails();
    }
}
