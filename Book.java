public class Book {
    private String title;
    private String author;
    private int pageCount;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.pageCount = 0;
    }

    // Parameterized constructor with title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pageCount = 0;
    }

    // Parameterized constructor with title, author, and pageCount
    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    // Display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Book book1 = new Book();
        Book book2 = new Book("Java Programming", "John Doe");
        Book book3 = new Book();
        Book book4 = new Book();
        

        // Displaying book details
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
        book4.displayDetails();
    }
}
