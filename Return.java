
import java.util.Scanner;

public class Return{
    public static void main(String[] args) {
        greet();
        int n1=readNumber();
        int n2=readNumber();      
        System.out.println("sum of numbers:"+Sum(n1, n2));
    }
    public static int readNumber(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number:");
        int number=input.nextInt();
        return number;
    }
    public static int Sum(int n1,int n2){
        int sum=n1+n2;
        return sum;
    }
    public static void greet(){
        System.out.println("Welcome to calculator");
    }
}