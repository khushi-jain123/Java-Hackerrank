import java.util.Arrays;
class CountEvenOdd{
	public static void main(String args[]){
		int[] array1={23,45,67,89,14,26,49,77};
		int evencount=0;
		int oddcount=0;
		for(int num :array1){//accessing can be done easily.
			if(num%2==0){
				evencount++;
			}
			else{
				oddcount++;
			}
		}
		System.out.println("Even no in array: "+evencount);
		System.out.println("odd no in array: "+oddcount);
		/*for(int num: array1){
			if(num%2==0){
				evencount++;
			}
			else{
				oddcount++;
			}*/
		}

	}
