//Extend the Book class to create an EBook class with an additional field, fileSize (in MB).
//Override the printDetails method to include the fileSize field in the output
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
        System.out.println("Book Title : "+title+"\nAuthor : "+author+"\nPrice : "+price);
    }
}
class Ebook extends Book{
    private int fileSize;
    public Ebook(String title,String author,int price,int fileSize){
        super(title,author,price);
        this.fileSize=fileSize;
    }

    @Override
    protected void printDetails(){
        super.printDetails();
        System.out.println("FileSize : "+fileSize+" MB");
    }
}
public class Prob4 {
    public static void main(String[] args) {
        Book b1=new Book("Rich dad poor dad","Robert kiwosaki",-8);
        Book b2=new Book("Nuvvu evaru ayithe naku enti","ajay",550);
        b1.printDetails();
        System.out.println("--------------------------------------");
        b2.printDetails();
        System.out.println("--------------------------------------");
        Ebook b3=new Ebook("Rich dad poor dad","Robert kiwosaki",-8,4);
        Ebook b4=new Ebook("Nuvvu evaru ayithe naku enti","ajay",550,10);
        b3.printDetails();
        System.out.println("--------------------------------------");
        b4.printDetails();

    }
}
