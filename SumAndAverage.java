
import java.util.Scanner;

public class SumAndAverage{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter array of size:");
        int num=input.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the value of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("The value of array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int sum=SumOfArray(arr);
        System.out.println("\nThe sum of array:"+sum);
        double average=AverageOfArray(sum,num);
        System.out.println("The average of array:"+average);
    }
    public static int SumOfArray(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static double AverageOfArray(int sum,int num){
        int average=sum/num;
        return average;
    }
}