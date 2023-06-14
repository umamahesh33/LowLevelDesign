package LMS.book;

public class BookCopy {
    private final BookDetails bookDetails;
    private final long bookId;

    public BookCopy(BookDetails bookDetails, long bookId) {
        this.bookDetails = bookDetails;
        this.bookId = bookId;
    }
}
