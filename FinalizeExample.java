import java.lang.String;
public class FinalizeExample {
    public static void main(String[] args) {
        Book book = new Book("Java Programming");
        // Setting the reference to null to make the object eligible for garbage collection
        book = null;
        // Explicitly triggering garbage collection (for demonstration purposes)
        System.gc();
        book.getClass();
        
    }
}

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    // Finalize method
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing: " + title);
    }

}
