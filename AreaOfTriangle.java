
import java.util.Scanner;

public class AreaOfTriangle{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a base=");
        float b=input.nextFloat();
        System.out.println("Enter a height=");
        float h=input.nextFloat();
        float AT=(b*h)/2;
        System.out.println("area of triangle is="+AT);
    }
}