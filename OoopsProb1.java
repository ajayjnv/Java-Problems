/*
Create a Class and Object:

Create a simple class Car with properties like brand, model, and year. Instantiate objects and print the properties.
Concepts: Classes, objects, and basic class structure
 */
class Car{
    private String brand;
    private String model;
    private int year;
    public Car(String brand,String model,int year){
        this.model=model;
        this.brand=brand;
        this.year=year;
    }
    @Override
    public String toString(){
        return ("Brand : "+brand+"\nModel : "+model+"\nYear : "+year+"\n");
    }
}
public class OoopsProb1{
    public static void main(String[] args) {
        Car obj1=new Car("Audi","electrical",2020);
        System.out.println(obj1);
        Car obj2=new Car("BMW","Disiel",2023);
        System.out.println(obj2);

    }
}
