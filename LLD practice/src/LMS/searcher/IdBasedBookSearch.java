package LMS.searcher;

import LMS.book.BookCopy;

import java.util.List;

public class IdBasedBookSearch implements BookSearcher{
    private final long bookId;

    public IdBasedBookSearch(long bookId) {
        this.bookId = bookId;
    }

    @Override
    public List<BookCopy> search() {
        return null;
    }
}
