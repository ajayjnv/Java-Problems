/*
Method Overloading
Problem: Create a class Calculator that has overloaded methods add(),
one that takes two integers and one that takes three integers. Call both methods and display the result.
 */

class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
}

public class Oops5{
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        System.out.println(c1.add(10,25));
        System.out.println(c1.add(25,56,100));
    }
}