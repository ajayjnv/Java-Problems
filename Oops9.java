/*
Problem: Create a class Book with attributes title, author, and price.
Overload the constructor to allow creating a Book object with different combinations of these attributes.
*/

class Book {
    private String title;
    private String author;
    private int price;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0;
    }

    // Constructor with only title
    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.price = 0;
    }

    // Constructor with only author
    public Book(String author, boolean isAuthor) {  // 'isAuthor' to distinguish between title and author
        this.title = "Unknown";
        this.author = author;
        this.price = 0;
    }

    // Constructor with only price
    public Book(int price) {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = price;
    }

    // Constructor with title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0;
    }

    // Constructor with title and price
    public Book(String title, int price) {
        this.title = title;
        this.author = "Unknown";
        this.price = price;
    }

    // Constructor with author and price
    public Book(String author, int price, boolean isAuthor) {
        this.title = "Unknown";
        this.author = author;
        this.price = price;
    }

    // Constructor with all three attributes
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Overriding the toString() method
    @Override
    public String toString() {
        return "Book Title: " + this.title + "\nBook Author: " + this.author + "\nBook Price: " + this.price;
    }
}

// Test class
public class Oops9 {
    public static void main(String[] args) {
        // Creating Book objects with different constructors
        Book b1 = new Book();
        System.out.println(b1);

        Book b2 = new Book("Rich Dad Poor Dad");
        System.out.println(b2);

        Book b3 = new Book("Robert Kiyosaki", true);  // Using the second String constructor for author
        System.out.println(b3);

        Book b4 = new Book(300);
        System.out.println(b4);

        Book b5 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki");
        System.out.println(b5);

        Book b6 = new Book("Rich Dad Poor Dad", 500);
        System.out.println(b6);

        Book b7 = new Book("Robert Kiyosaki", 800, true);  // Using the third constructor for author and price
        System.out.println(b7);

        Book b8 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 500);
        System.out.println(b8);
    }
}
