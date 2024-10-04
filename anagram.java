import java.util.Scanner;
import java.util.Arrays;
class anagram{
	public static boolean isAnagram(String str1,String str2){
		char[] array1=str1.toCharArray();
		char[] array2=str2.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);

		return Arrays.equals(array1, array2);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String str1=sc.nextLine();
		System.out.println("enter second string");
		String str2=sc.nextLine();
		if(isAnagram(str1,str2)){
			System.out.println("the strings are anagram");

		}
		else{
			System.out.println("the strings are not anagram");
		}
	}
}