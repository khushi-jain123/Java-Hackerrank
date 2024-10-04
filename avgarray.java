import java.util.Arrays;
class avgarray{
	public static void main(String args[]){
		int array1[]={
			67,90,72,34,67,87
		};
		int sum=0;
		for(int i=0; i>array1.length-1; i++){
			sum=sum+Arrays.toString(array1[i]);
			double avg=sum/array1.length;
			System.out.printf("average=" +avg);}
		}
		/*System.out.println("hello world");*/
	}


