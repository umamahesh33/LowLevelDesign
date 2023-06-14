package LMS;

import LMS.lib.Library;
import LMS.auth.UserAuthenticator;
import LMS.book.BookCopy;
import LMS.book.BookDetails;
import LMS.searcher.*;
import LMS.util.IdGenerator;

import java.util.Date;
import java.util.List;

public class Controller {

    public List<BookCopy> searchBooksByBookName(String bookName) {
        if(bookName==null)
            throw new IllegalArgumentException("book name can't be null");
        BookSearcher bookSearcher=new NameBasedBookSearch(bookName); // this type of invocation can be avoided after learning factory pattern
        return bookSearcher.search();
    }

    public List<BookCopy> searchBooksByAuthorsName(List<String> authors) {
        if(authors==null || authors.size()==0)
            throw new IllegalArgumentException("authors list can't be empty");
        BookSearcher bookSearcher=new AuthorBasedBookSearch(authors);
        return bookSearcher.search();
    }

    public List<Member> searchMembersByName(String memberName, String token) throws IllegalAccessException {
        if(token==null)
            throw new IllegalArgumentException("token can't be null");
        if(!UserAuthenticator.isAdmin(token))
            throw new IllegalAccessException("need access to perform this operation");
        MemberSearcher memberSearcher=new NameBasedMemberSearch(memberName);
        return memberSearcher.search();
    }

    // service package
    // AdminService class, all the remaining functions can be fitted here
    // Book (id unique book id,name,date,list of authors),
    // AddBookDao build this object and call bookDao.addBook();
    // DeleteBookDao and call its function
    // Member class(id, name, list of borrowed books with libraryCopyId, membershipStatus)
    //
    public void addBook(String bookName, Date publicationDate, List<String> authors, String token) throws IllegalAccessException {
        if(token==null)
            throw new IllegalArgumentException("token can't be null");
        if(!UserAuthenticator.isAdmin(token))
            throw new IllegalAccessException("need access to perform this operation");
        BookCopy bookCopy=new BookCopy(new BookDetails(bookName,publicationDate,authors), IdGenerator.getUniqueId());
        Library library=new Library();
        library.addBook(bookCopy);
    }
    
    public String deleteBook(long bookId, String token) throws IllegalAccessException {
        if(token==null)
            throw new IllegalArgumentException("token can't be null");
        if(!UserAuthenticator.isAdmin(token))
            throw new IllegalAccessException("need access to perform this operation");
        BookSearcher bookSearcher=new IdBasedBookSearch(bookId);
        List<BookCopy> bookCopies=bookSearcher.search();
        if(bookCopies.size()==0)
            throw new RuntimeException("There are no book copies with the provided book id");
        Library library=new Library();
        library.deleteBook(bookCopies.get(0));
    }

    public void blockMember(long memberId, String token) throws IllegalAccessException {
        if(token==null)
            throw new IllegalArgumentException("token can't be null");
        if(!UserAuthenticator.isAdmin(token))
            throw new IllegalAccessException("need access to perform this operation");
        MemberSearcher memberSearcher=new IdBasedMemberSearcher(memberId);
        List<Member> members=memberSearcher.search();
        if(members.size()==0)
            throw new RuntimeException("There are no members with provided member id");
        Library library=new Library();
        library.blockMember(members.get(0));
    }

    public void issueBook(long bookCopyId, long memberId, String token) throws IllegalAccessException {
        if(token==null)
            throw new IllegalArgumentException("token can't be null");
        if(!UserAuthenticator.isAdmin(token))
            throw new IllegalAccessException("access denied");
        if(bookCopyId<0)
            throw new IllegalAccessException("invalid book id");
        if(memberId<0)
            throw new IllegalArgumentException("invalid member id");
        BookSearcher bookSearcher=new IdBasedBookSearch(bookCopyId);
        List<BookCopy> bookCopies = bookSearcher.search();
        if(bookCopies==null || bookCopies.size() == 0)
            throw new RuntimeException("no book copies found with the id");
        MemberSearcher memberSearcher=new IdBasedMemberSearcher(memberId);
        List<Member> members = memberSearcher.search();
        if(members==null || members.size()==0)
            throw new RuntimeException("no members found with the id");
        Library library=new Library();
        library.issueBook(bookCopies.get(0), members.get(0));
    }

//    public void submitBook(long bookCopyId, long memberId, String token){
//
//    }

    public Member getBorrowerOfTheBook(long bookCopyId, String token){

    }

    public List<BookCopy> getBooksBorrowedByMember(long memberid, String token){

    }
}
