public class Pattern17 {
    void printPattern(int n){
        for(int i=1;i<=n;i++){
            char ch='A';
            ch--;
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<2*i;j++){
                if(j<=i){
                    ch++;
                    System.out.print(ch+" ");
                }
                else{
                    ch--;
                    System.out.print(ch+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern17 p=new Pattern17();
        p.printPattern(5);
    }
}
