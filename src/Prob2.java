//Write a Java program that:
//Takes an array of integers as input from the user.
//Finds and prints the maximum and minimum values in the array.
import java.util.*;
public class Prob2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int size=sc.nextInt();
        if(size<=0){
            System.out.println("Enter valid Array size ");
            return ;
        }
        int[] arr=new int[size];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0],min=arr[0];
        for(int i=1;i<size;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Maximum Element in array is : "+max);
        System.out.println("Minimum Element in Array is : "+min);
    }
}
