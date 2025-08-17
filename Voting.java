
import java.util.Scanner;

public class Voting{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=input.nextInt();
        if(age>=18){
            System.out.println("you can voting");
        }else{
            System.out.println("you can not voting");
        }
        System.out.println("Thank you for using....");
    }
}