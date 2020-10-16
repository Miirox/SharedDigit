import java.util.Scanner;

public class SharedDigit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a first number: ");
        int first = in.nextInt();

        System.out.print("Enter a second number: ");
        int second = in.nextInt();

        boolean sharedDigit = hasSharedDigit(first, second);

        if(sharedDigit){
            System.out.println("Both numbers have the same digit!!");
        } else{
            System.out.println("Both numbers don't have the same digit!!");
        }
    }

    public static boolean hasSharedDigit(int num1, int num2){
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99){
            return false;
        }

        int num1FirstDigit = num1 / 10;
        int num1LastDigit = num1 % 10;

        int num2FirstDigit = num2 / 10;
        int num2LastDigit = num2 % 10;

        if(num1FirstDigit == num2FirstDigit || num1FirstDigit == num2LastDigit || num1LastDigit == num2FirstDigit || num1LastDigit == num2LastDigit){
            return true;
        }
        return false;
    }
}