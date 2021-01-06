import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;


    @Before
    public void before(){
        library = new Library();
        book = new Book("Don Quixote", "Miguel De Cervantes", "Adventure");
        book1 = new Book("Gullivers Travels","Jonathan Swift","Adventure");
        book2 = new Book("Robinson Crusoe","Daniel Dafoe", "Adventure");
        book3 = new Book("Emma","Jane Austen", "Historical Fiction");
        book4 = new Book("Frankenstein","Mary Shelley", "Horror");
        book5 = new Book("Alice's Adventures In Wonderland","Lewis Carroll", "Fantasy");



    }
    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBookToLibrary(book);
        library.addBookToLibrary(book1);
        assertEquals(2, library.bookCount());
    }
}

