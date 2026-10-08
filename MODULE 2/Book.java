public class Book {
    String title;
    String author;
    double price;

    public Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book parameterizedBook = new Book("Java Basics", "John", 250.0);
        System.out.println("Default book: " + defaultBook.title + ", " + defaultBook.author + ", " + defaultBook.price);
        System.out.println("Parameterized book: " + parameterizedBook.title + ", " + parameterizedBook.author + ", " + parameterizedBook.price);
    }
}
