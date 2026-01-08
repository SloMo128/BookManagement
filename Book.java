/**
 * Class representing a book with title, author, and publication year.
 */
public class Book {

    // Fields (attributes)
    private String title;
    private String author;
    private int publicationYear;

    /**
     * Constructor to initialize a Book object.
     *
     * @param title           the title of the book
     * @param author          the author of the book
     * @param publicationYear the year of publication
     */
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Getter for publication year
    public int getPublicationYear() {
        return publicationYear;
    }

    /**
     * Returns a string representation of the Book object.
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Publication Year: " + publicationYear;
    }
}
