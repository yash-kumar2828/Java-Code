
import java.util.Scanner;

public class RightHalfPyramid{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter no of row:");
        int num=input.nextInt();
        patten(num);
    }
    public static void patten(int num){
         for (int i = 1; i <= num; i++)
         {
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
         }
    }
}