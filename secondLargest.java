import java.util.Arrays;
class secondLargest{
	public static void main(String args[]){
		int [] arr={23,45,67,89,19,90,34,87,99};
		System.out.println("original array"+Arrays.toString(arr));
		Arrays.sort(arr);
		int index=arr.length-1;
		while(arr[index]==arr[arr.length-1]){
			index--;
		}
		System.out.println("second largest: "+arr[index]);

	}
}