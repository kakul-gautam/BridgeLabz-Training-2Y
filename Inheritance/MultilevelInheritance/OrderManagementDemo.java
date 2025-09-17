package MultilevelInheritance;
class Order {
    protected String orderId;
    protected String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed on " + orderDate;
    }

    public void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }
}
class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped with tracking number: " + trackingNumber;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}
public class OrderManagementDemo {
    public static void main(String[] args) {
        Order order = new Order("ORD001", "2025-09-15");
        ShippedOrder shipped = new ShippedOrder("ORD002", "2025-09-14", "TRK123456");
        DeliveredOrder delivered = new DeliveredOrder("ORD003", "2025-09-13", "TRK654321", "2025-09-17");

        System.out.println("--- Order ---");
        order.displayDetails();

        System.out.println("\n--- Shipped Order ---");
        shipped.displayDetails();

        System.out.println("\n--- Delivered Order ---");
        delivered.displayDetails();
    }
}
