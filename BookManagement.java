import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Demonstrates managing a list of books and sorting them in various ways.
 */
public class BookManagement {

    public static void main(String[] args) {

        // Create a list of books
        ArrayList<Book> bookList = new ArrayList<>();

        // Add 3 books to the list
        bookList.add(new Book("IL SIGNORE DEGLI ANELLI", "J.R.R. Tolkien", 1954));
        bookList.add(new Book("HARRY POTTER", "J.K. Rowling", 1997));
        bookList.add(new Book("I PROMESSI SPOSI", "A. Manzoni", 1840));

        // --- Sort by publication year ---
        Collections.sort(bookList, Comparator.comparing(Book::getPublicationYear));
        System.out.println("\nBooks sorted by publication year:");
        for (Book book : bookList) {
            System.out.println(book);
        }

        // --- Sort by title length ---
        Collections.sort(bookList, Comparator.comparing(b -> b.getTitle().length()));
        System.out.println("\nBooks sorted by title length:");
        for (Book book : bookList) {
            System.out.println(book);
        }

        // --- Alternative way: sort by publication year using lambda ---
        Collections.sort(bookList, (b1, b2) -> Integer.compare(b1.getPublicationYear(), b2.getPublicationYear()));
        System.out.println("\nBooks sorted by publication year (alternative example):");
        for (Book book : bookList) {
            System.out.println(book);
        }

        // --- Alternative way: sort by title length using method reference ---
        Collections.sort(bookList, Comparator.comparingInt(b -> b.getTitle().length()));
        System.out.println("\nBooks sorted by title length (alternative example):");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
