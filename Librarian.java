import java.util.List;

public class Librarian {
    private int librarianId;
    private String name;

    public Librarian(int librarianId, String name) {
        this.librarianId = librarianId;
        this.name = name;
    }

    public void addBook(Book book, List<Book> books) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void removeBook(Book book, List<Book> books) {
        books.remove(book);
        System.out.println("Book removed successfully.");
    }
}
