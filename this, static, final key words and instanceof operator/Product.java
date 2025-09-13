public class Product {
    static double discount = 10.0; 
    public final String productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= 100) {
            discount = newDiscount;
            System.out.println("Discount updated to " + discount + "%");
        } else {
            System.out.println("Invalid discount value.");
        }
    }
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: ₹" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("Invalid product object.");
        }
    }
    public double getTotalPrice() {
        double discountedPrice = price - (price * discount / 100);
        return discountedPrice * quantity;
    }
    public static void main(String[] args) {
        Product.updateDiscount(15.0);

        Product p1 = new Product("P101", "Wireless Mouse", 799.0, 2);
        Product p2 = new Product("P102", "Bluetooth Speaker", 1499.0, 1);

        System.out.println("\n--- Product 1 Details ---");
        p1.displayProductDetails();
        System.out.println("Total Price: ₹" + p1.getTotalPrice());

        System.out.println("\n--- Product 2 Details ---");
        p2.displayProductDetails();
        System.out.println("Total Price: ₹" + p2.getTotalPrice());
    }
}
