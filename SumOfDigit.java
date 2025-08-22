
import java.util.Scanner;

public class SumOfDigit{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any positive number:");
        int num=input.nextInt();
        int sum=Digit(num);
        System.out.println("sum of digit is:"+sum);
    }
    public static int Digit(int num){
        int rem;
        int sum=0;
        while(num>0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        return sum;
    }
}