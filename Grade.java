
import java.util.Scanner;

public class Grade{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter five subject marks:");
        int m1=input.nextInt();
        int m2=input.nextInt();
        int m3=input.nextInt();
        int m4=input.nextInt();
        int m5=input.nextInt();
        int marks=m1+m2+m3+m4+m5;
        int avg=marks/5;
        System.out.println("your average is:"+avg);
        if(avg>=90 && avg<=100){
            System.out.println(avg+"--->A grade");
        }
        else if(avg>=75 && avg<90){
            System.out.println(avg+"--->B grade");
        }
        else if(avg>=60 && avg<75){
            System.out.println(avg+"--->C grade");
        }
        else if(avg>30 && avg<60){
            System.out.println(avg+"--->D grade");
        }
        else{
            System.out.println(avg+"--->F grade");
        }
    }
}