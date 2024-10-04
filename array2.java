import java.util.Arrays;

class array2{
    public static void main(String args[]){
        int array2[] = {25, 14, 56, 77, 18, 29, 49};
        int[] array1 = new int[7];  // Corrected the declaration of array1
        
        System.out.println("Source array: " + Arrays.toString(array2));
        
        for(int i = 0; i < array2.length; i++){
            array1[i] = array2[i];
        }
        
        System.out.println("New array: " + Arrays.toString(array1));  // Corrected to print array1
    }
}
