import java.util.*;
public class Pattern8 {
    public void printPattern(int n){
        int i=n;
        while(i>0){
            int j=n-i;
            while(j>0){
                System.out.print("  ");
                j--;
            }
            int k=1;
            while(k<(2*i)){
                System.out.print("* ");
                k++;
            }
            i--;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Pattern8 p1=new Pattern8();
        System.out.println("Enter no of rows : ");
        int rows=sc.nextInt();
        p1.printPattern(rows);
    }
}
