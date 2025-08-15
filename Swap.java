
import java.util.Scanner;

public class Swap{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.err.print("Enter first number=");
        int num1=input.nextInt();
        System.err.print("Enter second number=");
        int num2=input.nextInt();
        System.out.println("before swapping the value of num1="+num1);
        System.out.println("before swapping the value of num2="+num2);
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("after swapping the value of num1="+num1);
        System.out.println("after swapping the value of num2="+num2);
    }
}