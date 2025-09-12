package Level1;
public class Book {
    private String title;
    private String author;
    private double price;
    public Book() {
        this.title = "Untitled";
        this.author = "Unknown";
        this.price = 0.0;
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayInfo() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : ₹" + price);
    }
    public static void main(String[] args) {
        Book defaultBook = new Book();
        System.out.println("Default Book:");
        defaultBook.displayInfo();

        System.out.println("\n");
        Book customBook = new Book("Clean Code", "Robert C. Martin", 499.99);
        System.out.println("Custom Book:");
        customBook.displayInfo();
    }
}
