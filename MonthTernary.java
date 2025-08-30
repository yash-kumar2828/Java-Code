
import java.util.Scanner;

public class MonthTernary{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your month in number:");
        int month=input.nextInt();
        String monthStr=getMonthName(month);
        System.out.println("Month is:"+monthStr);
    }
    public static String getMonthName(int month){
        return switch(month){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
        };
}
