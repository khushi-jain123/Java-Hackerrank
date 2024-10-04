import java.util.Scanner;

public class RemoveSpaces {
    public static String removeSpaces(String s) {
        // Use replace() method to remove all spaces
        return s.replace(" ", "");
    }

    public static void main(String[] args) {
        // Taking input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove spaces from the input string
        String result = removeSpaces(input);

        // Display the result
        System.out.println("String without spaces: " + result);

        // Close the scanner
        scanner.close();
    }
}
