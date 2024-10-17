/*
Problem: Create a class Shape with a method draw().
Create two subclasses Circle and Square that override the draw() method.
Demonstrate compile-time polymorphism by method overloading
and run-time polymorphism by using the overridden method in different objects.
 */
class Shape{
    public void draw(int x){
        System.out.println("Shape Drawn successfully with length "+x);
    }
    public void draw(int x,int y){
        System.out.println("Shape Drawn successfully with "+x+" and "+y);
    }

}
class Circle extends Shape{
    @Override
    public void draw(int x){
        System.out.println("Circle drawn Successfully with radius "+x);
    }
}
class Square extends Shape{
    @Override
    public void draw(int x){
        System.out.println("Square drawn successfully with side "+x);
    }
}
public class Oops7{
    public static void main(String[] args) {
        Shape s1=new Shape();
        //to demonstrate compile time polymorphism
        s1.draw(5);
        s1.draw(4,5);

        //to demonstrate run time polymorphismn
        Shape s2=new Circle();
        s2.draw(55);
        Shape s3=new Square();
        s3.draw(10);
    }
}