/*
Create a class Laptop with attributes like brand, ram, and price.
Create multiple objects of the class and write a method to display the details of each laptop.
 */
class Laptop{
    private String brand;
    private int ram;
    private int price;
    public Laptop(String brand,int ram,int price){
        this.brand=brand;
        this.price=price;
        this.ram=ram;
    }
    public void printDetails(){
        System.out.println("Laptop Brand : "+this.brand+"\nram : "+this.ram+" GB\nPrice : "+this.price);
    }
}
class Oops14{
    public static void main(String[] args) {
        Laptop l1=new Laptop("Asus vivobook 16",16,50000);
        l1.printDetails();
        Laptop l2=new Laptop("Mac book pro",16,90000);
        l2.printDetails();
    }
}