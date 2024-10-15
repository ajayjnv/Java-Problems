import static java.lang.System.exit;

public class Fibbonocci {
    public int findFibonocci(int n){
        int fib1=0,fib2=1,temp=0;
        if(n<=0){
            System.out.println("N should not be negative");
            exit(1);
        }
        if(n==1){
            return fib1;
        }
        if(n==2){
            return fib2;
        }
        for(int i=3;i<=n;i++){
            temp=fib1+fib2;
            fib1=fib2;
            fib2=temp;
        }
        return temp;
    }
    public static void main(String[] args) {
        Fibbonocci f=new Fibbonocci();
        int result=f.findFibonocci(0);
        System.out.println("Result : "+result);
    }
}
