

/*
Problem: Create a class Student with private attributes name, rollNumber, and marks.
Provide public getter and setter methods to access and modify these attributes.
 */
class Student{
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name,int rollNumber,double marks){
        this.name=name;
        this.marks=marks;
        this.rollNumber=rollNumber;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setRollNumber(int rollNumber){
        this.rollNumber=rollNumber;
    }
    public void setMarks(double marks){
        this.marks=marks;
    }
    public String getName(){
        return this.name;
    }
    public int getRollNumber(){
        return this.rollNumber;
    }
    public double getMarks(){
        return this.marks;
    }
    @Override
    public String toString(){
        return ("Student Name : "+this.name+"\nRoll Number : "+this.rollNumber+"\nMarks : "+this.marks+"\n");
    }
}
public class Oops4 {
    public static void main(String[] args) {
        Student s1=new Student("Ajay",14,96);
        System.out.println(s1);
        Student s2=new Student("Nagarjuna",25,98);
        System.out.println(s2);
    }
}
