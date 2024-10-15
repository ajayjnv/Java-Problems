import java.util.*;
public class Pattern12{
    public void printPattern(int n){
        for(int i=1;i<=n;i++){
            int temp=0;
            for(int j=1;j<=2*n;j++){
                if(j<=i){
                    temp++;
                    System.out.print(temp+" ");
                }
                else if((2*n-j)<i){
                    System.out.print(temp+" ");
                    temp--;
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Pattern12 p1=new Pattern12();
        System.out.println("Enter no of rows : ");
        int rows=sc.nextInt();
        p1.printPattern(rows);
    }
}
