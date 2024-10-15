import java.util.*;

public class Prac6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input1 : ");
        int num1=sc.nextInt();
        System.out.println("Enter input2 : ");
        int num2=sc.nextInt();
        System.out.println("Before Swapping : \nnum1 = "+num1+"\nnum2 = "+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After Swapping : \nnum1 = "+num1+"\nnum2 = "+num2);
    }
}
