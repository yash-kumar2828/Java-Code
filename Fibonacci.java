import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n = input.nextInt();
        
        System.out.println("Fibonacci Series up to " + n + " terms:");
        printFibonacci(n);
        
    }

    public static void printFibonacci(int n) {
        int first = 0, second = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
