import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Prac5{
    public float add(float num1,float num2){
        return num1+num2;
    }
    public float sub(float num1,float num2){
        return num1-num2;
    }
    public float mul(float num1,float num2){
        return num1*num2;
    }
    public float div(float num1,float num2){
        return num1/num2;
    }
    public float mod(float num1,float num2){
        return num1%num2;
    }
    public static void main(String[] args) throws IOException {
        Prac5 p=new Prac5();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter num1 : ");
        float num1=Float.parseFloat(br.readLine());
        System.out.println("Enter num2 : ");
        float num2=Float.parseFloat(br.readLine());
        System.out.println("Addition = "+p.add(num1,num2));
        System.out.println("Subtraction = "+p.sub(num1,num2));
        System.out.println("Multiplication = "+p.mul(num1,num2));
        System.out.println("Division = "+p.div(num1,num2));
        System.out.println("Modulo = "+p.mod(num1,num2));
        br.close();

    }
}