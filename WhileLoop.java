
import java.util.Scanner;

public class WhileLoop{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n1=input.nextInt();
        int i=1;
        System.out.println("the table of "+n1);
        while(i<=10){ 
            System.out.println(n1+"*"+i+"="+(n1*i));
            i++;
        }
    }
}