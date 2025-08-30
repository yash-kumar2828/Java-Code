
import java.util.Scanner;

public class MinimumOfTwoNumber{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=input.nextInt();
        System.out.println("Enter second number:");
        int num2=input.nextInt();
        MinimumOfTwoNumber ternary=new MinimumOfTwoNumber();
        int min=ternary.min(num1,num2);
        System.out.println("minimum number is "+min);
    }
    public int min(int num1,int num2){
        return (num1<num2)?num1:num2;
    }
}