interface Taxable {
    double calculateTax();
    String getTaxDetails();
}
abstract class Product {
    private int productId;
    private String name;
    private double price;
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public abstract double calculateDiscount();
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
    }
}
class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; 
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; 
    }

    @Override
    public String getTaxDetails() {
        return "Electronics GST: 18%";
    }
}
class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15; 
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; 
    }

    @Override
    public String getTaxDetails() {
        return "Clothing GST: 5%";
    }
}
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; 
    }
}
class ProductProcessor {
    public static void printFinalPrice(Product[] products) {
        for (Product p : products) {
            p.displayDetails();
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0.0;
            double finalPrice = p.getPrice() + tax - discount;

            if (p instanceof Taxable) {
                System.out.println(((Taxable) p).getTaxDetails());
            } else {
                System.out.println("No tax applicable.");
            }

            System.out.println("Discount: ₹" + discount);
            System.out.println("Tax: ₹" + tax);
            System.out.println("Final Price: ₹" + finalPrice);
            System.out.println("---------------------------");
        }
    }
}
public class ECommercePlatform {
    public static void main(String[] args) {
        Product[] products = {
            new Electronics(101, "Smartphone", 30000),
            new Clothing(102, "Jeans", 2000),
            new Groceries(103, "Rice Bag", 800)
        };

        ProductProcessor.printFinalPrice(products); 
    }
}
