package AccessModifiers;
class Book {
    public String ISBN;           
    protected String title;       
    private String author;        
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void displayBookInfo() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
class EBook extends Book {
    private double fileSizeMB;
    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }
    public void displayEBookInfo() {
        System.out.println("EBook ISBN: " + ISBN);      
        System.out.println("EBook Title: " + title);    
        System.out.println("File Size: " + fileSizeMB + " MB");
    }
}
public class BookLibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
        book1.displayBookInfo();
        book1.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + book1.getAuthor());

        System.out.println("\n--- EBook Info ---");
        EBook ebook1 = new EBook("978-1492056270", "Java Cookbook", "Ian Darwin", 5.2);
        ebook1.displayEBookInfo();
    }
}
