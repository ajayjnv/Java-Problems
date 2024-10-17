/*
Problem: Create a class Outer with an attribute outerValue. Inside Outer,
create an inner class Inner that has a method to display outerValue.
Write a program to create an instance of the inner class and access its method.
 */
class Outer{
    private static int outerValue;
    public Outer(int x){
        Outer.outerValue=x;
    }
    static class Inner{
        void display(){
            System.out.println(outerValue);
        }
    }
}
class Oops12{
    public static void main(String[] args) {
        Outer o=new Outer(58);
        Outer.Inner q=new Outer.Inner();
        q.display();
    }
}