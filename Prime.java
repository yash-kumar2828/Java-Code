
import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any positive number:");
        int num=input.nextInt();
        boolean isPrime=CheckPrime(num);
        if(isPrime){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
    }
    public static boolean  CheckPrime(int num){
        int i=2;
        while(i<num){
            if(num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}