
import java.util.Scanner;

public class Palidrome{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=input.nextInt();
        boolean palidrome=checkPali(num);
        if(palidrome){
            System.out.println(num+" is a palidrome number");
        }
        else{
            System.out.println(num+" is not a palidrome number");
        }
    }
    public static boolean checkPali(int num){
        int rev=0;
        int temp=num;
        while(temp!=0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        return rev==num;
    }
}