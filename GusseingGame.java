
import java.util.Scanner;

public class GusseingGame{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=5,guess;
        do { 
            System.out.println("Please guess the number between 1 to 10:");
            guess=input.nextInt();  
        } while (num!=guess);
        System.out.println("you have successfully gased");
    }
}