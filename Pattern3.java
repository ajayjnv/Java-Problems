import java.util.*;
public class Pattern3 {
    public void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Pattern3 p1=new Pattern3();
        System.out.println("Enter no of rows : ");
        int rows=sc.nextInt();
        p1.printPattern(rows);
    }
}
