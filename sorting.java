import java.util.Arrays;
import java.util.Scanner;
class sorting{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter number of array");
		n=sc.nextInt();
		
		System.out.println("enter element");
		int myarr[]=new int[n];
		for(int i=0;i<n;i++){
			myarr[i]=sc.nextInt();
		}
		System.out.println("original array"+Arrays.toString(myarr));
		Arrays.sort(myarr);
		System.out.println("sorted array"+Arrays.toString(myarr));

	}
}