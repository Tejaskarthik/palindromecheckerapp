import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int temp = number;
        int reverse = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        if (reverse == number) {
            System.out.println(number + " is a Numeric Palindrome");
        } else {
            System.out.println(number + " is NOT a Numeric Palindrome");
        }

        scanner.close();
    }

}