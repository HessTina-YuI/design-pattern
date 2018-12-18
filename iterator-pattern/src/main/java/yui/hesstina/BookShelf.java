package yui.hesstina;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {

    private List<Book> books;
    private int last = 0;

    BookShelf() {
        books = new ArrayList<Book>();
    }

    Book getBookAt(int index) {
        return books.get(index);
    }

    void appendBook(Book book) {
        books.add(book);
        last++;
    }

    int getLength() {
        return last;
    }

    public Iterator getIterator() {
        return new BookShelfIterator(this);
    }
}
