package HybridInheritance;
class Vehicle {
    protected int maxSpeed;
    protected String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
interface Refuelable {
    void refuel();
}
class ElectricVehicle extends Vehicle {
    private int batteryLevel; 

    public ElectricVehicle(int maxSpeed, String model, int batteryLevel) {
        super(maxSpeed, model);
        this.batteryLevel = batteryLevel;
    }

    public void charge() {
        System.out.println(model + " is charging. Battery level: " + batteryLevel + "%");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Level: " + batteryLevel + "%");
    }
}
class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelLevel; // in liters

    public PetrolVehicle(int maxSpeed, String model, double fuelLevel) {
        super(maxSpeed, model);
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling. Current fuel level: " + fuelLevel + " liters");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Level: " + fuelLevel + " liters");
    }
}
public class VehicleSystemDemo {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(160, "Tesla Model 3", 85);
        PetrolVehicle pv = new PetrolVehicle(180, "Honda City", 25.5);

        System.out.println("--- Electric Vehicle ---");
        ev.displayInfo();
        ev.charge();

        System.out.println("\n--- Petrol Vehicle ---");
        pv.displayInfo();
        pv.refuel();
    }
}
