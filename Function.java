
import java.util.Scanner;

public class Function{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1=input.nextInt();
        System.out.println("Enter second number:");
        int n2=input.nextInt();
        Addition(n1, n2);
    }
    public static void Addition(int n1,int n2){
        int sum=n1+n2;
        System.out.println("The addition of two number="+sum);
    }
}