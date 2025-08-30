
import java.util.Scanner;

public class PasswordChecker{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String password;
        do { 
            System.out.println("Please enter your password");
            password=input.next();
        } while (!isValidPass(password));
        System.out.println("Thanks for entering a valid password");
    }
    public static boolean isValidPass(String password){
        return password.length()>6;
    }
}