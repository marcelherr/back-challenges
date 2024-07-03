public class main {
    public static void main(String[] args) {

        Book book1 = new Book("Der Medicus", "Noah Gordon", "1234-1234-1234");
        Book book2 = new Book("Die sieben Saulen der Erde", "Ken Folett", "1234-1234-1234");
        Book book3 = new Book("Wie man ein F1 Auto baut", "Adrian Newey", "1234-1234-1234");

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());

        Book[] books = {book1, book2, book3};

        Library Library = new Library(books);
        System.out.println(Library.toString());
    }

}
