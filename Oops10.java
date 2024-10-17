/*
Problem: Create a base class Person with attributes name and age.
Create a subclass Employee that adds the salary attribute.
Use the super keyword to call the base class constructor and display the details.
 */

class Person{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void details(){
        System.out.println("Name : "+this.name+"\nAge : "+this.age);
    }
}
class Employee extends Person{
    private int salary;
    public Employee(String name,int age,int salary){
        super(name,age);
        this.salary=salary;
    }
    public void details(){
        super.details();
        System.out.println("Salary : "+this.salary);
    }
}
public class Oops10{
    public static void main(String[] args) {
        Person p1=new Employee("Ajay",21,100000);
        p1.details();
    }
}