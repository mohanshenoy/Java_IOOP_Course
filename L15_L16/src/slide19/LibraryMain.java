package slide19;

class Library {
    private String name;
    private String address;

    Library(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void displayLibraryDetails() {
        System.out.println("Library Name: " + name);
        System.out.println("Library Address: " + address);
    }

    class Book {
        private String title;
        private String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        void displayBookDetails() {
            System.out.println("Book Title: " + title);
            System.out.println("Author " + author);
        }
    }
}

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library("Central Library", "Downtown");
        Library.Book book = library.new Book("Java Programming", "John Doe");

        library.displayLibraryDetails();
        book.displayBookDetails();
    }
}