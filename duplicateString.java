import java.util.Arrays;
import java.util.Scanner;

class duplicateString{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);

		// Ask the user for the number of elements in the array
		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();
		scanner.nextLine();  // Consume the newline character

		// Create an array to store the user input
		String[] myarr = new String[n];

		// Prompt the user to input the elements
		System.out.println("Enter " + n + " strings:");
		for(int i = 0; i < n; i++){
			myarr[i] = scanner.nextLine();
		}

		// Display the original array
		System.out.println("Original array: " + Arrays.toString(myarr));

		// Check for duplicate strings
		for(int i = 0; i < myarr.length - 1; i++){
			for(int j = i + 1; j < myarr.length; j++){
				if(myarr[i].equals(myarr[j]) && i != j){
					System.out.println("Duplicate string: " + myarr[i]);
				}
			}
		}

		// Close the scanner to avoid resource leakage
		scanner.close();
	}
}
