
import java.util.Scanner;

public class LCM{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1=input.nextInt();
        System.out.println("Enter second number:");
        int n2=input.nextInt();
        int lcm=FindLCM(n1, n2);
        System.out.println("LCM of two numbers is:"+lcm);
    }
    public static int FindLCM(int n1,int n2){
        int i=1;
        while(true){
            int factor=n1*i;
            if(factor%n2==0){
                return factor;
            }
            i++;
        }
    }
}