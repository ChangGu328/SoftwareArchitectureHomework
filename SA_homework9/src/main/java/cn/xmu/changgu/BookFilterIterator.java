package cn.xmu.changgu;

import java.util.NoSuchElementException;

public class BookFilterIterator implements Iterator {
    private BookShelf bookShelf;
    private String filter;
    private int nextIndex;

    public BookFilterIterator(BookShelf bookShelf, String filter) {
        this.bookShelf = bookShelf;
        this.filter = filter.toLowerCase();
        this.nextIndex = 0;
        findNextIndex();
    }

    private void findNextIndex() {
        while (nextIndex < bookShelf.getLength()) {
            Book book = bookShelf.getBookAt(nextIndex);
            if (book.getName().toLowerCase().contains(filter)) {
                return;
            }
            nextIndex++;
        }
    }

    public boolean hasNext() {
        return nextIndex < bookShelf.getLength();
    }

    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = bookShelf.getBookAt(nextIndex);
        nextIndex++;
        findNextIndex();
        return book;
    }
}

