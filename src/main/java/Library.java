import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public int tallyOfBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.tallyOfBooks() < this.capacity) {
            this.books.add(book);
        }

    }

}
