
import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any number=");
        int num=input.nextInt();
        int rev=reverse(num);
        System.out.println("reverse number is:"+rev);
    }
    public static int reverse(int num){
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return rev;
    }
}