import java.util.Scanner;

public class DeleteSpecificElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the size of array:");
        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the value of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("The value of array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nEnter the number you want to delete:");
        int numToDelete = input.nextInt();

        int[] newArr = deleteNumber(arr, numToDelete);

        System.out.println("Here is your new array:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
    public static int[] deleteNumber(int[] arr, int numToDelete) {
        int count = 0;
        for (int num : arr) {
            if (num == numToDelete) {
                count++;
            }
        }
        if (count == 0) {
            return arr;
        }
        int[] newArr = new int[arr.length - count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != numToDelete) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }
}
