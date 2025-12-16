import java.util.Date;

public class Loan {
    private int loanId;
    private Date issueDate;
    private Date dueDate;
    private Book book;
    private Member member;

    public Loan(int loanId, Date issueDate, Date dueDate, Book book, Member member) {
        this.loanId = loanId;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.book = book;
        this.member = member;
    }

    public double calculateFine() {
        Date today = new Date();
        if (today.after(dueDate)) {
            long diff = today.getTime() - dueDate.getTime();
            long daysLate = diff / (1000 * 60 * 60 * 24);
            return daysLate * 5.0; // fine per day
        }
        return 0.0;
    }
}
