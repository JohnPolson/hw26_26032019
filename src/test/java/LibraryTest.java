import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

        Library library;
        Book book;

        @Before
        public void before() {
            library = new Library(100);
        }

        @Test
        public void checkAddBook() {
            library.addBook(book);
            library.addBook(book);
            library.addBook(book);
            library.addBook(book);
            assertEquals(4, library.tallyOfBooks());
        }

        @Test
        public void checkRemoveBook() {
            library.addBook(book);
            library.addBook(book);
            library.addBook(book);

            library.removeBook();

            assertEquals(2, library.tallyOfBooks());
        }

        @Test
        public void checkMaxCapacity() {
            library = new Library(5);

            library.addBook(book);
            library.addBook(book);
            library.addBook(book);
            library.addBook(book);
            library.addBook(book);

            library.addBook(book);

            assertEquals(5, library.tallyOfBooks());
        }

}
