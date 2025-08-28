
import java.util.Scanner;

public class PalidromeArray{
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
        boolean isPalidrome=isPalidrome(arr);
        if(isPalidrome){
            System.out.println("\nyour array is palidrome");
        }else{
            System.out.println("\nyour array is not palidrome");
        }
    }
    public static boolean isPalidrome(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[arr.length-1-i]){
                return false;
            }
        }
        return true;
    }
}