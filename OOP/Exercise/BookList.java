
package OOP.Exercise;

import java.util.ArrayList;

public class BookList {

    private ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        book.addBook();
        bookList.add(book);
        System.out.println("Added successfully!");
    }

    public void updateBook(String id) {
        for (Book b : bookList) {
            if (b.getBookId().equals(id)) {
                b.updateBook(id);
                return;
            }
        }
        System.out.println("Not found ID: " + id);
    }

    public void deleteBookById(String id) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getBookId().equals(id)) {
                bookList.remove(i);
                System.out.println("Deleted ID: " + id);
                return;
            }
        }
        System.out.println("Not found ID: " + id);
    }

    public Book findBookById(String id) {
        for (Book b : bookList) {
            if (b.getBookId().equals(id)) {
                return b;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("Book list is empty!");
            return;
        }
        for (Book b : bookList) {
            b.displayBook();
            System.out.println("------------------");
        }
    }
}
