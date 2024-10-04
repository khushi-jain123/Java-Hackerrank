import java.util.Scanner;

class diffofLargeSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number:");
        int n = sc.nextInt();
        
        int maxDigit = Integer.MIN_VALUE; // Initialize to minimum possible value
        int minDigit = Integer.MAX_VALUE; // Initialize to maximum possible value
        
        n = Math.abs(n); // Convert number to absolute value

        while (n > 0) {
            int d = n % 10; // Extract the last digit
            
            if (d > maxDigit) {
                maxDigit = d;
            }
            
            if (d < minDigit) {
                minDigit = d;
            }
            
            n = n / 10; // Remove the last digit
        }
        
        int diff = maxDigit - minDigit; // Calculate the difference
        
        System.out.println("Difference between largest and smallest digits: " + diff);
        
        sc.close(); // Close the Scanner
    }
}
