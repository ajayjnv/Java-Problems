import java.util.*;
public class Pattern1 {
    public void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Pattern1  p1=new Pattern1();
        System.out.println("Enter no of rows : ");
        int rows=sc.nextInt();
        p1.printPattern(rows);
    }
}
