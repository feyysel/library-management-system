import java.util.List;

public class Book {
   private  int bookId;
   private  String title;
   private  String isbn;
   private  String status;
   private  List<Author> authors;

    public Book(int bookId, String title, String isbn) {
        this.bookId = bookId;
        this.title = title;
        this.isbn = isbn;
        this.status = "Available";
    }

    public void getDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + isbn);
        System.out.println("Status: " + status);
    }

    public void updateStatus(String status) {
        this.status = status;
    }
}
