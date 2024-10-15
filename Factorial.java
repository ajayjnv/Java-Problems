import java.time.*;
import java.time.format.*;
public class Factorial {
    public long findfac(int num){
        int fact=1;
        for(int i=2;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
    public long findfac1(int n){
        if(n<0){
            return -1;
        }
        if(n==1 || n==0){
            return n;
        }
        return n*findfac1(n-1);
    }
    public static void main(String[] args) {
        Factorial f1=new Factorial();
        DateTimeFormatter obj1=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime t1=LocalDateTime.now();
        String ff1=t1.format(obj1);
        long result=f1.findfac(0);
        System.out.println("Result : "+result);
        System.out.println(ff1);
        LocalTime t2=LocalTime.now();
        long result1=f1.findfac1(-1);
        System.out.println("Result : "+result1);
        System.out.println(t2);
    }
}
