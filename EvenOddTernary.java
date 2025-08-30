
import java.util.Scanner;

public class EvenOddTernary{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1=input.nextInt();
        String res=(num1%2==0)?"Even":"Odd";
        System.out.println("Your number is "+res);
    }
}