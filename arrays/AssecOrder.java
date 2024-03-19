package arrays;

public class AssecOrder {

	public static void main(String[] args) {
		int a[]= {8,2,4,5,6,7};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					a[i]=a[j];
				i++;
				j++;
			
				}
		
		
		
			System.out.println(a[j]);
		}

}}
}