import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> bookCollection;

    public Borrower(String name){
        this.name = name;
        this.bookCollection = new ArrayList<Book>();
    }

    public String getName() {
        return this.name;
    }

    public int countCollection(){
        return this.bookCollection.size();
    }

    public void addBookToCollection(Book book) {
        this.bookCollection.add(book);
    }
}
