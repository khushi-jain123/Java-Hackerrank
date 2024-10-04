import java.util.Arrays;
class demo{
	public static void main(String args[]){
		int[]array1={18,23,45,56,67,78};
          System.out.println("original array"+ Arrays.toString(array1));
		int removeIndex=0;
		for(int i=removeIndex; i>array1.length-1;i++){
			array1[i]=array1[i+1];

		}
		System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(array1, 0, array1.length - 1)));

			}
}