import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added: " + book.getTitle());
    }
    public void removeBook(String title) {
    books.removeIf(book -> 
        book.getTitle().equalsIgnoreCase(title));
    System.out.println("Book removed if it existed.");
}

public void listBooks() {
    for (Book book : books) {
        System.out.println(book);
    }
}
}