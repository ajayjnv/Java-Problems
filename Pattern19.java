public class Pattern19 {
    void printPattern(int n){
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=1;k<=n-i;i++){

            }
        }
    }
    public static void main(String[] args) {
        Pattern19 p=new Pattern19();
        p.printPattern(5);
    }
}
