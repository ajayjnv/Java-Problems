//implement a Book class with fields: title, author, and price.
//Write a method to display the book details.
//Create and display details for two Book objects.
package problem;
import java.util.*;
class Book{
    private String title;
    private String author;
    private int price;
    public Book(String title,String author,int price){
        this.price=price >=0 ? price:0;
        this.title=title;
        this.author=author;
    }
    protected void printDetails(){
        System.out.println("Book Title : "+title+"\nAuthor : "+author+"\nPrice : "+price+"\n-------------------------------------------");
    }
}
public class Prob3 {
    public static void main(String[] args) {
        Book b1=new Book("Rich dad poor dad","Robert kiwosaki",-8);
        Book b2=new Book("Nuvvu evaru ayithe naku enti","ajay",550);
        b1.printDetails();
        b2.printDetails();
    }
}
