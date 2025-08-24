
import java.util.Scanner;

public class Searching{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter array of size:");
        int num=input.nextInt();
        int[] arr=new int[num];
        System.out.println("enter five value:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("your values:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nwelcome to array searching:");
        System.out.println("Enter the number you want to search:");
        int search=input.nextInt();
        boolean isFound=isFound(arr, search);
        if(isFound){
            System.out.println("your number was found in the array");
        }
        else{
            System.out.println("your number was not found in the array");
        }
    }
    public static boolean isFound(int[] arr,int search){
        int i=0;
        while(i<arr.length){
            if(arr[i]==search){
                return true;
            }
            i++;
        }
        return false;
    }
}