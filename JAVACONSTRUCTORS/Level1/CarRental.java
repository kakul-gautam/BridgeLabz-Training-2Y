package Level1;
public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    public CarRental() {
        this("Guest", "Standard", 1); // Constructor chaining
    }
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    public double calculateTotalCost() {
        double dailyRate;
        switch (carModel.toLowerCase()) {
            case "sedan":
                dailyRate = 1500;
                break;
            case "suv":
                dailyRate = 2500;
                break;
            case "hatchback":
                dailyRate = 1000;
                break;
            default:
                dailyRate = 1200;
        }

        return dailyRate * rentalDays;
    }
    public void displayRentalDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.printf("Total Cost    : ₹%.2f\n", calculateTotalCost());
    }
    public static void main(String[] args) {
        CarRental defaultRental = new CarRental();
        System.out.println("Default Rental:");
        defaultRental.displayRentalDetails();

        System.out.println("\n");
        CarRental customRental = new CarRental("Kakul", "SUV", 4);
        System.out.println("Custom Rental:");
        customRental.displayRentalDetails();
    }
}
