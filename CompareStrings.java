import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Compare the two strings using the equals method
        boolean areEqual = firstString.equals(secondString);

        // Display the comparison result
        System.out.println("The two given strings are equal: " + areEqual);

        // Compare the first character of each string using charAt
        char firstChar = firstString.charAt(0);
        char secondChar = secondString.charAt(0);
        boolean firstCharsEqual = firstChar == secondChar;

        System.out.println("First character of the first string:  " + firstChar);
        System.out.println("First character of the second string: " + secondChar);
        System.out.println("The first characters are equal: " + firstCharsEqual);

        // Close the scanner
        scanner.close();
    }
}
