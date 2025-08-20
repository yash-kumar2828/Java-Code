
import java.util.Scanner;

public class BitwiseOperator{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number=");
        int n1=input.nextInt();
        System.out.println("Enter two number=");
        int n2=input.nextInt();
        System.out.println("Bitwise AND Operator:"+(n1&n2));
        System.out.println("Bitwise OR Operator:"+(n1|n2));
        System.out.println("Bitwise XOR Operator:"+(n1^n2));
        System.out.println("Bitwise NOT Operator:"+(~n1));
        System.out.println("Bitwise NOT Operator:"+(~n2));
        System.out.println("Bitwise Right Shoft Operator:"+(n1>>1));
        System.out.println("Bitwise Right Shoft Operator:"+(n2>>1));
        System.out.println("Bitwise Left Shift Operator:"+(n1<<1));
        System.out.println("Bitwise Left Shift Operator:"+(n2<<1));
    }
}