public class Pattern13 {
    void printPattern(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+"  ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern13 p=new Pattern13();
        p.printPattern(5);
    }
}
