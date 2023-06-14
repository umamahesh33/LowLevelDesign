package LMS.searcher;

import LMS.book.BookCopy;

import java.util.List;

public class AuthorBasedBookSearch implements BookSearcher {
    private final List<String> authors;

    public AuthorBasedBookSearch(List<String> authors) {
        this.authors = authors;
    }

    @Override
    public List<BookCopy> search() {
        return null;
    }
}
