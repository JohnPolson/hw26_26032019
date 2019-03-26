import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Library library;
    Book book;
    Borrower borrower;

    @Before
    public void before() {
        book = new Book("Brave New World", "Aldous Huxley", "non-fiction");
        library = new Library(100);
        borrower = new Borrower();
    }

    @Test
    public void checkBorrowBook() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);

        borrower.borrowBook(library);
        borrower.borrowBook(library);

        assertEquals(3, library.tallyOfBooks());
        assertEquals(2, borrower.tallyOfCollection());
    }

}
