
import java.util.Scanner;

public class ForLoop{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n1=input.nextInt();
        int i;
        System.out.println("the table of "+n1);
        for(i=1;i<=10;i++){ 
            System.out.println(n1+"*"+i+"="+(n1*i));
        }
    }
}