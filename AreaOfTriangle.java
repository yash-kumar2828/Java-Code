
import java.util.Scanner;

public class AreaOfTriangle{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a base=");
        int b=input.nextInt();
        System.out.println("Enter a height=");
        int h=input.nextInt();
        float AT=(b*h)/2;
        System.out.println("area of triangle is="+AT);
    }
}