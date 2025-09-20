interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    private double discount = 0.0;
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public double getPrice() { return price; }
    protected void setPrice(double price) { this.price = price; }

    public int getQuantity() { return quantity; }
    protected void setQuantity(int quantity) { this.quantity = quantity; }

    protected double getDiscount() { return discount; }
    protected void setDiscount(double discount) { this.discount = discount; }
    public abstract double calculateTotalPrice();
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Total Price: ₹" + calculateTotalPrice());
    }
}
class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - getDiscount();
    }

    @Override
    public void applyDiscount(double percentage) {
        double discountAmount = (getPrice() * getQuantity()) * (percentage / 100);
        setDiscount(discountAmount);
    }

    @Override
    public String getDiscountDetails() {
        return "Veg item discount applied: ₹" + getDiscount();
    }
}
class NonVegItem extends FoodItem implements Discountable {
    private static final double NON_VEG_CHARGE = 20.0; 

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double baseTotal = (getPrice() + NON_VEG_CHARGE) * getQuantity();
        return baseTotal - getDiscount();
    }

    @Override
    public void applyDiscount(double percentage) {
        double baseTotal = (getPrice() + NON_VEG_CHARGE) * getQuantity();
        double discountAmount = baseTotal * (percentage / 100);
        setDiscount(discountAmount);
    }

    @Override
    public String getDiscountDetails() {
        return "Non-veg item discount applied: ₹" + getDiscount();
    }
}
class OrderProcessor {
    public static void processOrder(FoodItem[] items) {
        for (FoodItem item : items) {
            if (item instanceof Discountable) {
                ((Discountable) item).applyDiscount(10); // Apply 10% discount
                System.out.println(((Discountable) item).getDiscountDetails());
            }
            item.getItemDetails();
            System.out.println("---------------------------");
        }
    }
}
public class OnlineFoodDelieverySystem {
    public static void main(String[] args) {
        FoodItem[] order = {
            new VegItem("Paneer Tikka", 250, 2),
            new NonVegItem("Chicken Biryani", 300, 1),
            new VegItem("Veg Burger", 120, 3)
        };

        OrderProcessor.processOrder(order);
    }
}
