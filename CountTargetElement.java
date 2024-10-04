import java.util.Scanner;
import java.util.Arrays;

class CountTargetElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array element:");
        int n = sc.nextInt();
        System.out.println("Enter element:");
        int myarr[] = new int[n];
        for (int i = 0; i < n; i++) {
            myarr[i] = sc.nextInt();
        }
        Arrays.sort(myarr);
        System.out.println("Enter target element:");
        int target = sc.nextInt();
        int count=0;
        for (int i=0; i<n;i++) {  
            if (myarr[i]==target) {  
                count++;
            }
        }

        if(count>0) {
            System.out.println("Count of target element: " + count);
        }
        else{
            System.out.println("Element not found");
        }
    }
}

        /*int count=0;s
        System.out.println("enter the target element");
        int target=sc.nextInt();
        if(arr[i]==target){
        	count++;
        }
        system.out.println("count of target element"+count);*/




	

//for if
//if a[i]==i
//count
