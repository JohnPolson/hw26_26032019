import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {

        Book book;

        @Before
        public void before() {
            book = new Book("Brave New World", "Aldous Huxley", "non-fiction");
        }

        @Test
        public void checkTitle() {
            assertEquals("Brave New World", book.getTitle());
        }

        @Test
        public void checkAuthor() {
            assertEquals("Aldous Huxley", book.getAuthor());
        }

        @Test
        public void checkGenre() {
            assertEquals("non-fiction", book.getGenre());
        }

}
