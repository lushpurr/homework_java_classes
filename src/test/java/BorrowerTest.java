import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;

    @Before
    public void before(){
        borrower = new Borrower("Gavin");
    }

    @Test
    public void borrowerHasName(){
        assertEquals("Gavin", borrower.getName());
    }

    @Test
    public void borrowerCollectionStartsEmpty(){
        assertEquals(0, borrower.countCollection());
    }

//    @Test
//    public void canAddBookToCollection(){
//
//        assertEquals(1, borrower.countCollection() );
//    }
}


