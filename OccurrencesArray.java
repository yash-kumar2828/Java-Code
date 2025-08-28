
import java.util.Scanner;

public class OccurrencesArray{
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
        System.out.println("Enter the number you want to find:");
        int num=input.nextInt();
        int occurrences=nOfOccurrence(arr, num);
        System.out.println("\nyour element was found "+ occurrences +" times in the array");
    }
    public static int nOfOccurrence(int[] arr,int num){
        int occ=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                occ++;
            }
        }
        return occ;
    }
}