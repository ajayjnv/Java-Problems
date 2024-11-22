//Write a Java program that:
//Takes two integers as input from the user.
//Prints "Even" if their sum is even and "Odd" if it is odd.

import java.util.*;
public class Prob1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1 : ");
        int a=sc.nextInt();
        System.out.println("Enter number2 : ");
        int b=sc.nextInt();
        int sum=a+b;
        if(sum%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
