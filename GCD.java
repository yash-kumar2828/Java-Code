
import java.util.Scanner;

public class GCD{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1=input.nextInt();
        System.out.println("Enter second number:");
        int n2=input.nextInt();
        int gcd=FindGCD(n1, n2);
        System.out.println("GCD of two numbers is:"+gcd);
    }
    public static int FindGCD(int n1,int n2){
        int gcd=1;
        int i=2;
        int least=least(n1, n2);
        while(i<=least){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
            i++;
        }
        return gcd;
    }
    public static int least(int n1,int n2){
        if(n1<n2){
            return n1;
        }
        else{
            return n2;
        }
    }
}