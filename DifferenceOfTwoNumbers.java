import java.util.Scanner;

public class DifferenceOfTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();

        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();

        // Calculate the difference of the two numbers
        int difference = firstNumber - secondNumber;

        // Display the result
        System.out.println("The difference of " + firstNumber + " and " + secondNumber + " is " + difference);

        // Close the scanner
        scanner.close();
    }
}
