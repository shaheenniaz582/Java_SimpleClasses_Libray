import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibrayTest {

    Library library;
    Book book;

    @Before
    public void setUp(){
        library = new Library(100);
        book = new Book("Book1","ABC");
    }

    @Test
    public void canAddBookToLibray(){
        library.add(book);
        assertEquals(1, library.getBookCount());

    }


}
