public class Pattern16 {
    void printPattern(int n){
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
            ch++;
        }
    }
    public static void main(String[] args) {
        Pattern16 p=new Pattern16();
        p.printPattern(5);
    }
}
