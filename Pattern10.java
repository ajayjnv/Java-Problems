import java.util.*;
public class Pattern10{
    public void printPattern(int n){
        int stars=0;
        for(int i=1;i<=2*n-1;i++){
            stars=(i<=n)?i:n-(i%n);
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Pattern10 p1=new Pattern10();
        System.out.println("Enter no of rows : ");
        int rows=sc.nextInt();
        p1.printPattern(rows);
    }
}
