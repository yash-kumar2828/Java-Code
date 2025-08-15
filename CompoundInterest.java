
import java.util.Scanner;

public class CompoundInterest{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter principle amount=");
        int p=input.nextInt();
        System.out.println("Enter time of years=");
        int t=input.nextInt();
        System.out.println("Enter interest rate=");
        int r=input.nextInt();
        int c=p*(1+r/100)*t;
        System.out.println("your compound interest="+c);
    }
}