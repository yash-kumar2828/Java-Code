
import java.util.Scanner;

public class DoWhileLoop{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int age;
        do { 
            System.out.println("please enter your valid age:");
            age=input.nextInt();
        }while(age<1||age>100);
        
        System.out.println("your age is:"+age);
    }
}