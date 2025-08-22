import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt(); 

        boolean arm = checkArm(num);

        if (arm) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

    }

    public static boolean checkArm(int num) {
        int numCopy = num;
        int digit = noOfDigits(num);
        int finalNum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            finalNum += pow(lastDigit, digit);
        }

        return finalNum == numCopy;
    }

    public static int pow(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static int noOfDigits(int num) {
        if (num == 0) return 1;
        int digit = 0;
        while (num > 0) {
            digit++;
            num /= 10;
        }
        return digit;
    }
}
