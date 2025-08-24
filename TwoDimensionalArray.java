
import java.util.Scanner;

public class TwoDimensionalArray{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of row:");
        int row=input.nextInt();
        int col=input.nextInt();
        int[][] arr=new int[row][col];
        int i,j;
        System.out.println("Enter the value of matrix:");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                arr[i][j]=input.nextInt();
            }
        }
        System.out.println("Matrix form:");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}