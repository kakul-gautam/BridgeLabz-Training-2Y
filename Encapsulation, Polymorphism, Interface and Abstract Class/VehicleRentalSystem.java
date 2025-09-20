interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber;
    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public double getRentalRate() { return rentalRate; }
    public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }
    protected String getMaskedPolicyNumber() {
        return "****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
    public abstract double calculateRentalCost(int days);
    public void displayDetails(int days) {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate per Day: ₹" + rentalRate);
        System.out.println("Rental Cost for " + days + " days: ₹" + calculateRentalCost(days));
    }
}
class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.10;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance (10%): ₹" + calculateInsurance() + " | Policy: " + getMaskedPolicyNumber();
    }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9; 
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance (5%): ₹" + calculateInsurance() + " | Policy: " + getMaskedPolicyNumber();
    }
}
class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500; 
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance (15%): ₹" + calculateInsurance() + " | Policy: " + getMaskedPolicyNumber();
    }
}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] fleet = {
            new Car("MH12AB1234", 1500, "CARPOL123456"),
            new Bike("DL5SB9876", 500, "BIKEPOL654321"),
            new Truck("KA03TR7890", 3000, "TRUCKPOL789012")
        };

        int rentalDays = 5;

        for (Vehicle v : fleet) {
            v.displayDetails(rentalDays);
            if (v instanceof Insurable) {
                Insurable insured = (Insurable) v;
                System.out.println(insured.getInsuranceDetails());
                System.out.println("Total Cost (Rental + Insurance): ₹" +
                    (v.calculateRentalCost(rentalDays) + insured.calculateInsurance()));
            }
            System.out.println("---------------------------");
        }
    }
}
