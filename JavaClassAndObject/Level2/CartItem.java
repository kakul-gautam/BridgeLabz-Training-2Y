package Level2;
import java.util.Scanner;

public class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor to initialize CartItem object
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to add an item to the cart
    void addItem(int qty) {
        quantity += qty;
        System.out.println("Added " + qty + " items. New quantity: " + quantity);
    }

    // Method to remove an item from the cart
    void removeItem(int qty) {
        if (quantity >= qty) {
            quantity -= qty;
            System.out.println("Removed " + qty + " items. New quantity: " + quantity);
        } else {
            System.out.println("Cannot remove more than current quantity");
        }
    }

    // Method to display the total cost
    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter initial quantity: ");
        int quantity = scanner.nextInt();

        CartItem item = new CartItem(itemName, price, quantity);

        System.out.print("Enter quantity to add: ");
        int addQty = scanner.nextInt();
        item.addItem(addQty);

        System.out.print("Enter quantity to remove: ");
        int remQty = scanner.nextInt();
        item.removeItem(remQty);

        item.displayTotalCost();

        scanner.close();
    }
}
