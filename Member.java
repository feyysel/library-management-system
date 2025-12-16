import java.util.ArrayList;
import java.util.List;

public class Member {
  private int memberId;
  private  String name;
  private  List<Loan> loans;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.loans = new ArrayList<>();
    }

    public void borrowBook(Book book, Loan loan) {
        loans.add(loan);
        book.updateStatus("Issued");
        System.out.println(name + " borrowed " + book);
    }

    public void returnBook(Book book, Loan loan) {
        loans.remove(loan);
        book.updateStatus("Available");
        System.out.println(name + " returned " + book);
    }
}
