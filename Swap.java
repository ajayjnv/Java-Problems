public class Swap {
    public static void main(String[] args) {
        int a=40,b=30;
        System.out.printf("Before Swapping: \nA = %d\nB = %d\n",a,b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.printf("After Swapping: \nA = %d\nB = %d",a,b);
    }
}
