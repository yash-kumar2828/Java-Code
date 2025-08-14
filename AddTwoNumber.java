
import java.util.Scanner;

public class AddTwoNumber{
    public static void main(String[] args) {
        System.err.println("Welcome to our Calculator");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your first number=");
        int num1=input.nextInt();
        System.out.print("Enter your second number=");
        int num2=input.nextInt();
        int sum=num1+num2;
        System.err.println("addition of two number is="+sum);
    }
}