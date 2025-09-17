package SingleInheritance;
class Book {
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}
class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }
}
public class LibraryManagementDemo {
    public static void main(String[] args) {
        Author book1 = new Author(
            "The Pragmatic Programmer",
            1999,
            "Andrew Hunt",
            "Co-author of one of the most influential programming books, focused on software craftsmanship."
        );

        System.out.println("--- Book Details ---");
        book1.displayInfo();
    }
}
