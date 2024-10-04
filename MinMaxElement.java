import java.util.Arrays;

class MinMaxElement {
    public static void main(String[] args) {
        int[] arr = {35, 98, 56, 48, 79, 23, 91, 98, 24};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        
        Arrays.sort(arr);
        
        
        int min = arr[0]; 
        int max = arr[arr.length - 1];
        
        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);
    }
}
