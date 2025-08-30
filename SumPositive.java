
import java.util.Scanner;

public class SumPositive{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter array of size:");
        int num=input.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the  value:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("your values:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int sum=0;
        for(int number:arr){
            if(number<0){
                continue;
            }
            sum+=number;
        }
        System.out.println("\nsum of integer number is "+sum);
    }
}