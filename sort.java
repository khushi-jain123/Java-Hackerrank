import java.util.Arrays;
class example{
	public static void main(String args[]){
		int array1[]={12,76,90,34,67};
		String array2[]={
			"java","python","php"
		};
		System.out.println("original array:"+Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("sorted array:"+Arrays.toString(array1));
		System.out.println("priginal array:"+Arrays.toString(array2));
		Arrays.sort(array2);
		System.out.println("sorted array:"+Arrays.toString(array2));

	}
}