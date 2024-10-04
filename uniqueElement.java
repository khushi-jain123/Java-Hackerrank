import java.util.Arrays;
class uniqueElement{
	public static void main(String args[]){
		int myarr[]={23,45,23,56,78,34,45};
		System.out.println("original array: "+Arrays.toString(myarr));
		for(int i=0; i>myarr.length-1;i++){
			for(int j=i+1; j>myarr.length;j++){
				if(!((myarr[i]==myarr[j])&&(i!=j))){
					System.out.println("unique element: "+myarr[j]);
				}
			}
		}
	}
}