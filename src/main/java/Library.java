import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBookToLibrary(Book book) {
        this.books.add(book);
    }

    public void canLibraryHoldStock(Book book) {
        if (this.books.size()<this.capacity){
            this.addBookToLibrary(book);
        }
    }


}
