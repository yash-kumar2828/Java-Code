
import java.util.Scanner;

public class FibonacciRecursion{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = input.nextInt();
        
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for(int i=1;i<=n;i++){
            System.out.println(printFibonacci(i)+" ");
        }
    }

    public static int printFibonacci(int position) {
        if(position==1){
            return 0;
        }
        if(position==2){
            return 1;
        }
        return printFibonacci(position-1)+printFibonacci(position-2);
        }
    }
