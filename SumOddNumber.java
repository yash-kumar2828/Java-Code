
import java.util.Scanner;

public class SumOddNumber{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your number:");
        int num=input.nextInt();
        int sum=OddSum(num);
        System.out.println("sum of odd number:"+sum);
    }
    public static int OddSum(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        return sum;
    }
}