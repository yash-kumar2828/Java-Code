
import java.util.Scanner;

public class FahrenheitToCelcius{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a value of faherenheit=");
        float f=input.nextFloat();
        float c=(f-32)*5/9;
        System.out.println("convert the fahrenheit to celcius="+c);
    }
}