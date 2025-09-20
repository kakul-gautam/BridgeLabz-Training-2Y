interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;
    public Vehicle(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }
    public String getVehicleId() { return vehicleId; }
    public void setVehicleId(String vehicleId) { this.vehicleId = vehicleId; }

    public String getDriverNameMasked() {
        return "****" + driverName.substring(Math.max(0, driverName.length() - 4));
    }

    public double getRatePerKm() { return ratePerKm; }
    public void setRatePerKm(double ratePerKm) { this.ratePerKm = ratePerKm; }

    protected String getCurrentLocation() { return currentLocation; }
    protected void setCurrentLocation(String location) { this.currentLocation = location; }
    public abstract double calculateFare(double distance);
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver: " + getDriverNameMasked());
        System.out.println("Rate per Km: ₹" + ratePerKm);
        System.out.println("Current Location: " + getCurrentLocation());
    }
}
class Car extends Vehicle implements GPS {
    public Car(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50;
    }

    @Override
    public String getCurrentLocation() {
        return super.getCurrentLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}
class Bike extends Vehicle implements GPS {
    public Bike(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return super.getCurrentLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}
class Auto extends Vehicle implements GPS {
    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 30; 
    }

    @Override
    public String getCurrentLocation() {
        return super.getCurrentLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}
class FareCalculator {
    public static void processRides(Vehicle[] vehicles, double distance) {
        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            double fare = v.calculateFare(distance);
            System.out.println("Fare for " + distance + " km: ₹" + fare);
            System.out.println("---------------------------");
        }
    }
}
public class RideHailingApp {
    public static void main(String[] args) {
        Vehicle[] fleet = {
            new Car("CAR101", "Kakul Sharma", 15.0, "Mathura Junction"),
            new Bike("BIKE202", "Rajiv Mehta", 8.0, "Krishna Nagar"),
            new Auto("AUTO303", "Neha Verma", 10.0, "Dwarkadhish Temple")
        };

        double rideDistance = 12.5; 
        FareCalculator.processRides(fleet, rideDistance); 
    }
}
