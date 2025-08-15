
import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter principle amount=");
        int p=input.nextInt();
        System.out.println("Enter time of years=");
        int t=input.nextInt();
        System.out.println("Enter interest rate=");
        int r=input.nextInt();
        int s=(p*r*t)/100;
        System.out.println("your simple interest is="+s);
    }
}