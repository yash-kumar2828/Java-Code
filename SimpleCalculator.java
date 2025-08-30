
import java.util.Scanner;

public class SimpleCalculator{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=input.nextInt();
        System.out.println("Enter second number:");
        int num2=input.nextInt();
        System.err.println("Choices are:\n1.addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus");
        System.out.println("Enter your choice:");
        int choice=input.nextInt();
        int res=switch(choice){
            case 1->num1+num2;
            case 2->num1-num2;
            case 3->num1*num2;
            case 4->num1/num2;
            case 5->num1%num2;
            default->-1;
        };
        System.out.println("Your answer is:"+res);
    }
}