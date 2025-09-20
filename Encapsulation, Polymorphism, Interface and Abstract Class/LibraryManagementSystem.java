interface Reservable {
    boolean reserveItem(String borrowerName);
    boolean checkAvailability();
}
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private String borrowerName;
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.borrowerName = null; 
    }
    public String getItemId() { return itemId; }
    public void setItemId(String itemId) { this.itemId = itemId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    protected void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    protected String getMaskedBorrowerName() {
        return (borrowerName == null) ? "None" : "****" + borrowerName.substring(Math.max(0, borrowerName.length() - 4));
    }
    public abstract int getLoanDuration(); 
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println("Borrower: " + getMaskedBorrowerName());
    }
}
class Book extends LibraryItem implements Reservable {
    private boolean available = true;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21; 
    }

    @Override
    public boolean reserveItem(String borrowerName) {
        if (available) {
            setBorrowerName(borrowerName);
            available = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}
class Magazine extends LibraryItem implements Reservable {
    private boolean available = true;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; 
    }

    @Override
    public boolean reserveItem(String borrowerName) {
        if (available) {
            setBorrowerName(borrowerName);
            available = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}
class DVD extends LibraryItem implements Reservable {
    private boolean available = true;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public boolean reserveItem(String borrowerName) {
        if (available) {
            setBorrowerName(borrowerName);
            available = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("B001", "The Pragmatic Programmer", "Andrew Hunt"),
            new Magazine("M101", "National Geographic", "Various"),
            new DVD("D501", "Inception", "Christopher Nolan")
        };
        ((Reservable) items[0]).reserveItem("Kakul Sharma");
        ((Reservable) items[2]).reserveItem("Rajiv Mehta");
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Available: " + ((Reservable) item).checkAvailability());
            System.out.println("---------------------------");
        }
    }
}
