import java.util.Arrays;

public class Library {
    Book[] booksArray;

    public Library(Book[] booksArray) {
        this.booksArray = booksArray;
    }

    public Book[] getBooksArray() {
        return booksArray;
    }

    public void setBooksArray(Book[] booksArray) {
        this.booksArray = booksArray;
    }

    public String toString() {
        return "Library: " + Arrays.toString(booksArray);
    }

}
