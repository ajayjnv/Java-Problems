public class Pattern18 {
    void printPattern(int n){
        for(int i=1;i<=n;i++){
            char ch=(char)(65+n-i);
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern18 p=new Pattern18();
        p.printPattern(5);
    }
}
