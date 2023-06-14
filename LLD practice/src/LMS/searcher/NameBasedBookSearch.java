package LMS.searcher;

import LMS.book.BookCopy;

import java.util.List;

public class NameBasedBookSearch implements BookSearcher{
    private final String bookName;

    public NameBasedBookSearch(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public List<BookCopy> search() {
        return null;
    }
}
