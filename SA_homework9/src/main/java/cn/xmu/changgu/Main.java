package cn.xmu.changgu;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Forrest Gump"));
        bookShelf.appendBook(new Book("The Gump and Co."));

        // Create a filtered iterator to only show books containing "Gump"
        Iterator it = new BookFilterIterator(bookShelf, "Gump");
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}

