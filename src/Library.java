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
public void borrowBook(String title) {
    for (Book book : books) {
        if (book.getTitle().equalsIgnoreCase(title)) {
            if (book.borrowBook()) {
                System.out.println("Borrowed successfully.");
            } else {
                System.out.println("Already borrowed.");
            }
            return;
        }
    }
    System.out.println("Book not found.");
}

public void returnBook(String title) {
    for (Book book : books) {
        if (book.getTitle().equalsIgnoreCase(title)) {
            if (book.returnBook()) {
                System.out.println("Returned successfully.");
            } else {
                System.out.println("Was not borrowed.");
            }
            return;
        }
    }
    System.out.println("Book not found.");
}
}