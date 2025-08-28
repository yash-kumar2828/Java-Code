
import java.util.Scanner;

public class MaxAndMin{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the value of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        } 
        System.out.println("The value of array:");
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
        int max=max(arr);
        System.out.println("\nThe maximum value of array:"+max);
        int min=min(arr);
        System.out.println("The minimum value of array:"+min);
    }
    public static int max(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static int min(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}