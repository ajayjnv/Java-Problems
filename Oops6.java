/*
Inheritance
Problem: Create a base class Employee with attributes like name, id, and salary.
Create a derived class Manager that extends Employee and adds an additional attribute bonus.
Write methods to display the details of both classes.
 */
import java.util.*;
class Employee{
    private String name;
    private int id;
    private int salary;

    public Employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public String toString(){
        return "Employee name : "+this.name+"\nId : "+this.id+"\nSalary : "+this.salary;
    }
}
class Manager extends Employee{
    private int bonus;
    public Manager(int bonus,String name,int id,int salary){
        super(name,id,salary);
        this.bonus=bonus;
    }
    public String toString(){
        return super.toString()+"\nBonus : "+this.bonus;
    }
}
public class Oops6{
    public static void main(String[] args) {
        Manager m1=new Manager(25000,"Ajay",25,99000);
        System.out.println(m1);
        Employee e1=new Employee("jeevan",14,100000);
        System.out.println(e1);
    }
}