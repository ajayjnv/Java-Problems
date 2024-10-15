/*
Problem: Create a class Rectangle with attributes length and breadth.
Write a constructor to initialize the values and a method area() to return the area.
Use the this keyword to differentiate between class variables and method parameters
 */


class Rectangle{
    private double length;
    private double breadth;

    public Rectangle(double l,double b){
        this.breadth=b;
        this.length=l;
    }
    public void setLength(double l){
        this.length=l;
    }
    public void setBreadth(double b){
        this.breadth=b;
    }

    public double getLength(){
        return this.length;
    }
    public double getBreadth(){
        return this.breadth;
    }

    public double area(){
        return (this.length*this.breadth);
    }
}
public class Oop3 {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(10,5);
        System.out.println(r1.area());
        Rectangle r2=new Rectangle(20,10);
        System.out.println(r2.area());
    }
}
