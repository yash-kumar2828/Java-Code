
import java.util.Scanner;

public class PalidromeStringRecursion{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=input.next();
        System.err.println("Your string is "+(isPalidrome(str)?"palidrome":"not palidrome"));
    }
    public static boolean isPalidrome(String str){
        if(str.length()<=1){
            return true;
        }
        int lastPos=str.length()-1;
        if(str.charAt(0)!=str.charAt(lastPos)){
            return false;
        }
        String newStr=str.substring(1,lastPos);
        return isPalidrome(newStr);
    }
}