import java.util.*;
public class Pattern4 {
    public void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"\t");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Pattern4 p1=new Pattern4();
        System.out.println("Enter no of rows : ");
        int rows=sc.nextInt();
        p1.printPattern(rows);
    }
}
