import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter a word: ");
            String input = scanner.nextLine();

            String reversed = new StringBuilder(input).reverse().toString();

            if (input.equalsIgnoreCase(reversed)) {
                System.out.println(input + " is a Palindrome");
            } else {
                System.out.println(input + " is NOT a Palindrome");
            }

            System.out.print("Do you want to continue? (yes/no): ");
            choice = scanner.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        scanner.close();
    }

}