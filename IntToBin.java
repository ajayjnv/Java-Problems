public class IntToBin {
    public long converter(int a){
        long bin=0;
        int pow=1;
        int i=0;
        while(i<32){
            bin=((a%2)*pow)+bin;
            a=a/2;
            pow=pow*10;
            i++;
        }
        return bin;
    }
    public static void main(String[] args) {
        IntToBin c=new IntToBin();
        long result=c.converter(33);
        System.out.println("Binary Form : "+result);
    }
}
