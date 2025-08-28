
import java.util.Scanner;

public class SortedArray{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the value of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("the value of array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        boolean asc=ascending(arr);
        boolean dec=descending(arr);
        if(asc || dec){
            System.out.println("\nyour array is sorted");
        }else{
            System.out.println("\nyour array is not sorted");
        }
    }
    public static boolean ascending(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static boolean descending(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                return false;
            }
        }
        return true;
    }
}