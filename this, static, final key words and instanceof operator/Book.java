public class Book {
    static String libraryName = "City Central Library";
    public final String isbn;
    private String title;
    private String author;
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        } else {
            System.out.println("Invalid book object.");
        }
    }

    public static void main(String[] args) {
        Book.displayLibraryName();  

        Book book1 = new Book("978-0140449136", "The Odyssey", "Homer");
        Book book2 = new Book("978-0261103573", "The Hobbit", "J.R.R. Tolkien");

        System.out.println("\n--- Book 1 Details ---");
        book1.displayBookDetails();

        System.out.println("\n--- Book 2 Details ---");
        book2.displayBookDetails();
    }
}
