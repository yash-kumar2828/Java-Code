
import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any positive number:");
        int num=input.nextInt();
        int fact=FindFact(num);
        System.out.println("Factorial of "+num+" is="+fact);
    }
    public static int FindFact(int num){
        int fact=1;
        if(num==0 || num==1){
            return 1;
        }
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
}