package yui.hesstina;

public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;
    private int index;

    BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    public Object next() {
        Object book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
