public class Addition {
    public int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Addition a1=new Addition();
        int result=a1.add(66,90);
        System.out.println("Result : "+result);

    }
}
