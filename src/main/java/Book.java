import java.util.HashMap;

public class Book {
    private String title;
    private String author;
    HashMap<String, String> genere;

    public Book(String title, String Author){
        this.title = title;
        this.author = author;
        this.genere = new HashMap<String, String>();
    }


}
