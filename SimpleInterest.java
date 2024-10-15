public class SimpleInterest {
    public double calci(long p,double t,double r){
        double si;
        si=(p*t*r)/100;
        return si;
    }
    public static void main(String[] args) {
        SimpleInterest s1=new SimpleInterest();
        System.out.println("Result : "+s1.calci(10000,5,5));
    }
}
