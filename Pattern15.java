public class Pattern15{
    void printPattern(int n){
        for(int i=n;i>0;i--){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern15 p=new Pattern15();
        p.printPattern(5);
    }
}
