import java.util.Arrays;

class reverseArray {
    public static void main(String args[]) {
        int arr[] = {45, 89, 24, 30, 56, 78, 24, 56};
        
        // Print the original array
        System.out.println("Original array: " + Arrays.toString(arr));

        // Start and end should be indices, not values from the array
        int start = 0;
        int end = arr.length - 1;
        int temp;

        // Reverse the array using the correct indices
        while (start < end) {
            // Swap elements at start and end positions
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move start and end towards each other
            start++;
            end--;
        }

        // Print the reversed array
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
