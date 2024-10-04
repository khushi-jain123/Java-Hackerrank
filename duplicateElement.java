import java.util.Arrays;
class duplicateElement{
	public static void main(String args[]){
		int[] myarr={67,45,90,14,56,67,45,90,90,90};
		for(int i=0;i<myarr.length-1;i++){
			for(int j=i+1; j<myarr.length;j++){
				if((myarr[i]==myarr[j])&&(i!=j)){
					System.out.println("Duplicate Element: "+myarr[j]);
				}
			}

		}
	}
}