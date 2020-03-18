import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> book;

    public Library(int capacity){
        this.capacity = capacity;
        this.book = new ArrayList<Book>();
    }

    public void add(Book book) {
        if(checkStock()== false)
          this.book.add(book);
    }

    public int getBookCount() {
        return this.book.size();
    }

    public boolean checkStock(){
        boolean stockIsFull;
        if(this.capacity >=101){
            stockIsFull = true;
        }else{
            stockIsFull = false;
        }
        return stockIsFull;
    }

}
