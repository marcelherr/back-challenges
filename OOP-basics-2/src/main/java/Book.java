public class Book {
    String title;
    String author;
    String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String toString() {
        return "Title: " + title + " Author: " + author + " Isbn: " + isbn;
    }

    public String getTitle() {
        return this.title = title;
    }

    public String getAuthor() {
        return this.author = author;
    }

    public String getIsbn() {
        return this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}
