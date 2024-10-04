import java.util.*;
class sortArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array element:");
        int n = sc.nextInt();
        System.out.println("Enter element:");
        Integer myarr[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            myarr[i] = sc.nextInt();
        }
        System.out.println("before start"+Arrays.toString(myarr));
        int mid=n/2;
        Arrays.sort(myarr,0,mid);
        Arrays.sort(myarr,mid,n,Collections.reverseOrder());
        System.out.println("after start"+Arrays.toString(myarr));
        	}
}