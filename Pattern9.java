import java.util.*;
public class Pattern9 {
    public void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<2*i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<2*i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Pattern9 p1=new Pattern9();
        System.out.println("Enter no of rows : ");
        int rows=sc.nextInt();
        p1.printPattern(rows);
    }
}
