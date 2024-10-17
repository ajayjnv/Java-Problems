/*
Problem: Create two interfaces Movable and Flyable, each with a method move() and fly(), respectively.
 Create a class FlyingCar that implements both interfaces and demonstrate how Java handles multiple inheritance.
 */
interface Movable{
    void move();
}
interface Flyable{
    void fly();
}
class FlyingCar implements Movable,Flyable{
    @Override
    public void move(){
        System.out.println("Moving.....");
    }
    @Override
    public void fly(){
        System.out.println("flying.....");
    }
}
class Oops11{
    public static void main(String[] args) {
        FlyingCar f1=new FlyingCar();
        f1.fly();
        f1.move();
    }
}