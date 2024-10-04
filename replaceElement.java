import java.util.Arrays;
class replaceElement{
	public static void main(String args[]){
		int[] my_array={26,89,70,15,67};
		int index=2;
		int new_values=5;
		System.out.println("Original array:"+Arrays.toString(my_array));
		for(int i=my_array.length-1; i>index;i--){
			my_array[i]=my_array[i-1];
		}
		my_array[index]=new_values;
		System.out.println("replaced array:"+Arrays.toString(my_array));

	}
}