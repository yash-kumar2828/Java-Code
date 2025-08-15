
import java.util.Scanner;

public class SorthandOperator{
    public static void main(String[] args) {
        int a=5;
        System.out.println("the value of a="+a);
        Scanner input=new Scanner(System.in);
        System.out.println("Enter four number=");
        int x1=input.nextInt();
        a+=x1;
        System.out.println("the value of a="+a);
        int x2=input.nextInt();
        a-=x2;
        System.out.println("the value of a="+a);
        int x3=input.nextInt();
        a*=x3;
        System.out.println("the value of a="+a);
        int x4=input.nextInt();
        a/=x4;
        System.out.println("the value of a="+a);
    }
}