
import java.util.Scanner;

public class ArithmeticOperator{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first number=");
        int num1=input.nextInt();
        System.out.print("Enter second number=");
        int num2=input.nextInt();
        System.out.println("addition="+(num1+num2));
        System.out.println("subtraction="+(num1-num2));
        System.out.println("multiplication="+(num1*num2));
        System.out.println("division="+(num1/num2));
        System.out.println("modulus="+(num1%num2));
    }
}