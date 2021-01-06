import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before(){
        borrower = new Borrower("Gavin");
        book = new Book("Don Quixote", "Miguel De Cervantes", "Adventure");

    }

    @Test
    public void borrowerHasName(){
        assertEquals("Gavin", borrower.getName());
    }

    @Test
    public void borrowerCollectionStartsEmpty(){
        assertEquals(0, borrower.countCollection());
    }

    @Test
    public void canAddBookToCollection(){
        library.addBookToLibrary(book);
        Book bookRemoved = library.removeBookFromLibrary(0);
        borrower.addBookToCollection(bookRemoved);
        assertEquals(1, borrower.countCollection() );
    }
}


