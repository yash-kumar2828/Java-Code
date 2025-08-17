
import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any year");
        int year=input.nextInt();
        if(year%400==0 || year%4==0 && year%100!=0){
            System.out.println("this given year is a leap year");
        }
        else{
            System.out.println("this given year is not a leap year");
        }
    }
}