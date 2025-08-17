
import java.util.Scanner;

public class PosNeg{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=input.nextInt();
        if(num<0){
            System.out.println("this number is negative");
        }
        else if(num>0){
            System.out.println("this number is positive");
        }
        else{
            System.out.println("this number is zero");
        }
    }
}