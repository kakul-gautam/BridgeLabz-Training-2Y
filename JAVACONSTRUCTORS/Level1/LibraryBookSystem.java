package Level1;
public class LibraryBookSystem {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;
    public LibraryBookSystem() {
        this("Untitled", "Unknown", 0.0, true);
    }
    public LibraryBookSystem(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed \"" + title + "\".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently unavailable.");
        }
    }
    public void displayInfo() {
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : ₹" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
    public static void main(String[] args) {
        LibraryBookSystem book1 = new LibraryBookSystem("Atomic Habits", "James Clear", 399.00, true);
        System.out.println("Book Details:");
        book1.displayInfo();

        System.out.println("\nAttempting to borrow the book...");
        book1.borrowBook();

        System.out.println("\nUpdated Book Details:");
        book1.displayInfo();

        System.out.println("\nTrying to borrow again...");
        book1.borrowBook();
    }
}
