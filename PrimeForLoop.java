
import java.util.Scanner;

public class PrimeForLoop{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=input.nextInt();
        boolean isPrime=isPrime(num);
        System.out.println("your number is "+(isPrime?"prime":"not prime"));
    }
    public static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%2==0){
                return false;
            }
        }
        return true;
    }
}